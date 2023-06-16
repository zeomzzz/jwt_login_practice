package com.zeomzzz.loginpractice.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Component;

@Component
public class EncryptUtil {
	public EncryptUtil() {}
	
	public String doEncrypt(String password) throws NoSuchAlgorithmException {
		
		MessageDigest md = MessageDigest.getInstance("SHA-256");
			
		md.update(password.getBytes()); // 패스워드에 SHA256 적용
		byte[] pwd = md.digest();

		StringBuilder sb = new StringBuilder(); // 10진수 문자열로 변
		for(byte b : pwd) {
			sb.append(String.format("%02x", b));
		}

		return sb.toString();
		
	}

}