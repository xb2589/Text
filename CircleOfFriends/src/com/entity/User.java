package com.entity;

public class User {

	
	private Integer userId;
	private String user;
	private String password;
	private String alternate ;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAlternate() {
		return alternate;
	}
	public void setAlternate(String alternate) {
		this.alternate = alternate;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", user=" + user + ", password="
				+ password + ", alternate=" + alternate + "]";
	}
	
	
	
	
}
