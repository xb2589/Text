package com.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.entity.User;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userdao;

	@Override
	public Integer register(User user) {
		// TODO Auto-generated method stub
		Integer registerInteger = userdao.register(user);
		return registerInteger;
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		User loginUser = userdao.login(user);
		return loginUser;
	}

	@Override
	public User isRepeat(User user) {
		// TODO Auto-generated method stub
		User isRepeatUser = userdao.isRepeat(user);
		return isRepeatUser;
	}

}
