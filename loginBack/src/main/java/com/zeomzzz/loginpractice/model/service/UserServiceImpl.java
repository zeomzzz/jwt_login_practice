package com.zeomzzz.loginpractice.model.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeomzzz.loginpractice.model.dao.UserDao;
import com.zeomzzz.loginpractice.model.dto.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public Map<String, String> login(String userId) {
		System.out.println("여기는 서비스");
		System.out.println(userId);
		return userDao.selectById(userId);
	}
	
	
}
