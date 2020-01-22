package com.mutipcai.vo.user;

import java.io.Serializable;
import java.util.Date;

public class UserInfoVo implements Serializable,Cloneable {

	/**
	 * 用户信息
	 */
	private static final long serialVersionUID = -2870175962681334251L;
	private Long userno;
	private String userid;
	private String usernam;
	private String password;
	private Date createdtm;
	private String phoneval;
	private String mailval;
	
	
	public UserInfoVo() {
		super();
	}
	
	public UserInfoVo(Long userno, String userid, String usernam, String password, Date createdtm, String phoneval,
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
	
	
	public UserInfoVo(Long userno, String userid, String usernam) {
		super();
		this.userno = userno;
		this.userid = userid;
		this.usernam = usernam;
	}

	public Long getUserno() {
		return userno;
	}
	public void setUserno(Long userno) {
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
	public Date getCreatedtm() {
		return createdtm;
	}
	public void setCreatedtm(Date createdtm) {
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
