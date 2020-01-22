package com.mutipcai.mapper.user;

import com.mutipcai.vo.user.UserInfoVo;

public interface UserMapper {
	/**
	 * 根据手机查询用户个数
	 * @param phone
	 * @return
	 */
	public Integer countuser(String phone);
	/**
	 * 注册用户,并返回用户主键到vo中
	 * @param userinfo
	 */
	public void createuser(UserInfoVo userinfo);

}
