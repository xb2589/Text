package com.service;

import java.util.List;

import com.entity.TMessage;

public interface TMessageService {

	// 新增评论
	Integer insertMessage(TMessage tMessage);
	
	// 查询所有评论
	List<TMessage> selectMessage(TMessage tMessage);

}
