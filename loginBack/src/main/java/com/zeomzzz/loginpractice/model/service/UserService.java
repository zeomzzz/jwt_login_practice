package com.zeomzzz.loginpractice.model.service;

import org.springframework.stereotype.Service;

import com.zeomzzz.loginpractice.model.dto.User;

@Service
public interface UserService {

	User login(String userId);

}
