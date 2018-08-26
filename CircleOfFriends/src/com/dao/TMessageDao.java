package com.dao;

import java.util.List;

import com.entity.TMessage;

public interface TMessageDao {

	// 新增评论
	Integer insertMessage(TMessage tMessage);
	
	// 查询评论
	List<TMessage> selectMessage(TMessage tMessage);
}
