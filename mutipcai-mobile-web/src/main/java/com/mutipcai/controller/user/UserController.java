package com.mutipcai.controller.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mutipcai.service.user.UserService;
import com.mutipcai.vo.user.UserInfoVo;



@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userservice;
	
	@RequestMapping("/index")
	public String index(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession();
		UserInfoVo userinfovo = (UserInfoVo) session.getAttribute("userinfovo");
		if (null == userinfovo) {
			return "login";
		} else {
			return "index";
		}

	}
	
	@RequestMapping("/register")
	public Map<String, Object> register(HttpServletRequest request, HttpServletResponse response,UserInfoVo userinfo) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			String code = "fail";
			String msg = "操作失败";
			JSONObject data = new JSONObject();
			
			boolean flag = userservice.checksameuser(userinfo.getPhoneval());
			if(flag){
				flag = userservice.createuser(userinfo);
				if(flag){
					code = "sucess";
					msg = "操作成功";
				}

			}else{
				msg = "注册失败,该手机号已被注册！";
			}
			result.put("code", code);
			result.put("msg", msg);
			result.put("data", data);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		

	}


}
