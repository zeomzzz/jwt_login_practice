package com.zeomzzz.loginpractice.controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zeomzzz.loginpractice.model.dto.User;
import com.zeomzzz.loginpractice.model.service.UserService;
import com.zeomzzz.loginpractice.util.EncryptUtil;
import com.zeomzzz.loginpractice.util.JwtUtil;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/api-user")
@Api(tags = "User 컨트롤러")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
public class UserRestController {

	@Autowired
	UserService us;
	
	@Autowired
	JwtUtil jwtUtil;
	
	private static final String SUCCESS = "succes";
	private static final String FAIL = "fail";
	
	@Autowired
	EncryptUtil encryptUtil;
	
	@PostMapping("/login")
	public ResponseEntity<?> login(User user) throws NoSuchAlgorithmException{
		
		Map<String, Object> result = new HashMap<String, Object>();
		HttpStatus status = null;
		
		try {
			if ((user.getUserId() != null || user.getUserId().length() > 0) && (user.getUserPw() != null || user.getUserPw().length() > 0)) {
				// DB 유저 정보 확인
				User loginUser = us.login(user.getUserId());
				System.out.println("여기는 컨트롤러");
				System.out.println(user.getUserId());
				
				System.out.println(encryptUtil.doEncrypt(user.getUserPw()));
				System.out.println("여기서오류나나 ??");
				System.out.println(loginUser.getUserPw());
				
				if(loginUser != null && encryptUtil.doEncrypt(user.getUserPw()).equals(loginUser.getUserPw())) { // 존재하는 ID + 비밀번호 암호화한 결과가 일치
					result.put("access-token", jwtUtil.createToken("id", loginUser.getUserId()));
					result.put("message", SUCCESS);
					result.put("userId", loginUser.getUserId());
					status = HttpStatus.ACCEPTED;
					System.out.println(result);
				} else {
					System.out.println("여기???");
					result.put("message", FAIL);
					status = HttpStatus.NO_CONTENT;
				}
			}
		} catch (UnsupportedEncodingException e) {
			result.put("message", FAIL);
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<Map<String, Object>>(result, status);
	}
	
	
}