package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CircleOfFriendsDao;
import com.entity.CircleOfFriends;
import com.service.CircleOfFriendsService;

@Service
public class CircleOfFriendsServiceImpl implements CircleOfFriendsService {

	@Autowired
	private CircleOfFriendsDao circleOfFriendsDao;

	@Override
	public List<CircleOfFriends> findAllCircleof() {
		// TODO Auto-generated method stub
		List<CircleOfFriends> findAllCircleof = circleOfFriendsDao
				.findAllCircleof();
		return findAllCircleof;
	}



	@Override
	public Integer uploadImage(String base64, CircleOfFriends cir) {
		// TODO Auto-generated method stub			
		Integer uploadImage = circleOfFriendsDao.uploadImage(cir);
		return uploadImage;
	}



	@Override
	public Integer upload(CircleOfFriends cir) {
		// TODO Auto-generated method stub
		Integer upload = circleOfFriendsDao.uploadImage(cir);
		return upload;
	}



	@Override
	public List<CircleOfFriends> selectById(CircleOfFriends cir) {
		// TODO Auto-generated method stub
		List<CircleOfFriends> selectById = circleOfFriendsDao.selectById(cir);
		return selectById;
	}



	@Override
	public Integer delete(Integer id) {
		// TODO Auto-generated method stub
		Integer delete = circleOfFriendsDao.delete(id);
		return delete;
	}



//	@Override
//	public List<CircleOfFriends> selectById(CircleOfFriends cir) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
