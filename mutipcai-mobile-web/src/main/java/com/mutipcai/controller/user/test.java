package com.mutipcai.controller.user;

import org.springframework.util.DigestUtils;

public class test {
	public static void main(String[] args) {
		String md5Password = DigestUtils.md5DigestAsHex("1234".getBytes());
		System.out.println(md5Password);
	}
}
