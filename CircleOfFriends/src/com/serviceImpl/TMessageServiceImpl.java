package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TMessageDao;
import com.entity.TMessage;
import com.service.TMessageService;

@Service
public class TMessageServiceImpl implements TMessageService {

	@Autowired
	private TMessageDao tmessageDao;
	
	@Override
	public Integer insertMessage(TMessage tMessage) {
		// TODO Auto-generated method stub
		Integer insertMessage = tmessageDao.insertMessage(tMessage);
		return insertMessage;
	}

	@Override
	public List<TMessage> selectMessage(TMessage tMessage) {
		// TODO Auto-generated method stub
		List<TMessage> selectMessage = tmessageDao.selectMessage(tMessage);
		return selectMessage;
	}

}
