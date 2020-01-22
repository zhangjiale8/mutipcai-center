package com.mutipcai.service.user;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.mutipcai.mapper.user.UserMapper;
import com.mutipcai.service.finance.FinanceService;
import com.mutipcai.vo.user.UserInfoVo;


@Service
public class UserService {
	@Autowired
	UserMapper usermapper;
	
	@Autowired
	FinanceService financeService;
	public boolean checksameuser(String phone) {
		boolean reslut = true;
		Integer result = usermapper.countuser(phone);
		if(result > 0){
			reslut = false;
		}
		return reslut;
	}
	
	
	public boolean createuser(UserInfoVo userinfo) {
		boolean flg = false;
		userinfo.setPassword(DigestUtils.md5DigestAsHex(userinfo.getPassword().getBytes()));
		userinfo.setCreatedtm(new Date());
		userinfo.setUserid("DCDF"+userinfo.getPhoneval());
		usermapper.createuser(userinfo);
		if(null != userinfo.getUserno()){
			
			financeService.initFinanceAcount(userinfo.getUserno());
		}
		return flg;
	}

}
