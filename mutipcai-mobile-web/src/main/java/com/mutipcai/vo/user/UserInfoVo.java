package com.mutipcai.vo.user;

import java.io.Serializable;

public class UserInfoVo implements Serializable,Cloneable {

	/**
	 * 用户信息
	 */
	private static final long serialVersionUID = -2870175962681334251L;
	private long userno;
	private String userid;
	private String usernam;
	private String password;
	private String createdtm;
	private String phoneval;
	private String mailval;
	
	
	public UserInfoVo() {
		super();
	}
	
	public UserInfoVo(long userno, String userid, String usernam, String password, String createdtm, String phoneval,
			String mailval) {
		super();
		this.userno = userno;
		this.userid = userid;
		this.usernam = usernam;
		this.password = password;
		this.createdtm = createdtm;
		this.phoneval = phoneval;
		this.mailval = mailval;
	}
	
	
	public UserInfoVo(long userno, String userid, String usernam) {
		super();
		this.userno = userno;
		this.userid = userid;
		this.usernam = usernam;
	}

	public long getUserno() {
		return userno;
	}
	public void setUserno(long userno) {
		this.userno = userno;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsernam() {
		return usernam;
	}
	public void setUsernam(String usernam) {
		this.usernam = usernam;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreatedtm() {
		return createdtm;
	}
	public void setCreatedtm(String createdtm) {
		this.createdtm = createdtm;
	}
	public String getPhoneval() {
		return phoneval;
	}
	public void setPhoneval(String phoneval) {
		this.phoneval = phoneval;
	}
	public String getMailval() {
		return mailval;
	}
	public void setMailval(String mailval) {
		this.mailval = mailval;
	}
	
	
	
}
