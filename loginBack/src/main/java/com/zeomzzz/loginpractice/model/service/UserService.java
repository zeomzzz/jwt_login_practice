package com.zeomzzz.loginpractice.model.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.zeomzzz.loginpractice.model.dto.User;

@Service
public interface UserService {

	Map<String, String> login(String userId);

}
