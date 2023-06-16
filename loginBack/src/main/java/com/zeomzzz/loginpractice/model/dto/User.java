package com.zeomzzz.loginpractice.model.dto;

public class User {

	private int userNo;
	private String userId;
	private String userPw;
	
	
	// 생성자
	public User() {}
	
	public User(int userNo, String userId, String userPw) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userPw = userPw;
	}

	// getter (setter는 필요할 때 만들기)
	public int getUserNo() {
		return userNo;
	}
	
	public String getUserId() {
		return userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	
	
}
