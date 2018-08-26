package com.dao;


import java.util.List;

import com.entity.CircleOfFriends;

public interface CircleOfFriendsDao {

	// 发表动态
	Integer uploadImage(CircleOfFriends cir);
	
	// 查看所有动态
	List<CircleOfFriends> findAllCircleof();
	
	// selectById
	List<CircleOfFriends> selectById(CircleOfFriends cir);
	
	// 删除动态
	Integer delete(Integer id);
	
	
	

}
