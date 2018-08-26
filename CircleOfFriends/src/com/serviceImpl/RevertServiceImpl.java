package com.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.RevertDao;
import com.entity.Revert;
import com.service.RevertService;

@Service
public class RevertServiceImpl implements RevertService {

	@Autowired
	private RevertDao revertDao;
	
	@Override
	public Integer insertRevert(Revert revert) {
		// TODO Auto-generated method stub
		Integer insertRevert = revertDao.insertRevert(revert);
		return insertRevert;
	}

}
