package com.zeomzzz.loginpractice.model.dao;

import com.zeomzzz.loginpractice.model.dto.User;

public interface UserDao {

	User selectById(String userId);

}
