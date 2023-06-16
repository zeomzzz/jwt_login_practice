package com.zeomzzz.loginpractice.util;

import java.io.UnsupportedEncodingException;

import org.springframework.stereotype.Component;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {
	
	//비밀키
	private static final String SALT = "zeomzzz";
	
	// 1. 토큰 생성
	public String createToken(String claimId, String data) throws UnsupportedEncodingException {
		return Jwts.builder()
				.setHeaderParam("alg", "HS256")
				.setHeaderParam("typ", "JWT")
				.claim(claimId, data)
				.signWith(SignatureAlgorithm.HS256, SALT.getBytes("UTF-8"))
				.compact();
	}
	
	// 2. 유효성 검사
	public void valid(String token) {
		Jwts.parser().setSigningKey(SALT.getBytes()).parseClaimsJws(token);
	}

}