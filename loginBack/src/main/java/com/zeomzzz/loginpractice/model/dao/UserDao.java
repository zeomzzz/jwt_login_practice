package com.zeomzzz.loginpractice.model.dao;

import java.util.Map;

import com.zeomzzz.loginpractice.model.dto.User;

public interface UserDao {

	Map<String, String> selectById(String userId);

}
