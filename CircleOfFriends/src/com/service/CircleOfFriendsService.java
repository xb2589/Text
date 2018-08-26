package com.service;

import java.util.List;

import com.entity.CircleOfFriends;
import com.entity.Comm;

public interface CircleOfFriendsService {
	
	// 发表
	 Integer uploadImage(String base64list, CircleOfFriends cir);
	
	// 查看所有
	List<CircleOfFriends> findAllCircleof();
	
	// 发表
	Integer upload(CircleOfFriends cir);
	
	// selectById
	List<CircleOfFriends> selectById(CircleOfFriends cir);
	
	// 删除
	Integer delete(Integer id);
	

}
