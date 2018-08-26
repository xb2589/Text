package com.dao;

import java.util.List;

import com.entity.Thumb;

public interface ThumbDao {
	
	// 点赞
	Integer giveStart(Thumb thumb);
	
	// 所有点赞的人
	List<Thumb> whoThumb(Thumb thumb);
	
	// 删除点赞
	Thumb deleteDZ(Thumb thumb);
}
