package com.service;

import com.entity.User;

public interface UserService {

	// 注册
	public Integer register(User user);

	// 登录
	public User login(User user);

	// 用户名是否重复
	public User isRepeat(User user);
}
