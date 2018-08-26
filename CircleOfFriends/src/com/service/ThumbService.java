package com.service;

import java.util.List;

import com.entity.Thumb;
import com.entity.User;

public interface ThumbService {
	
	// 点赞
	Integer giveStart(Thumb thumb);

	// 所有点赞的人
	List<Thumb> whoThumb(Thumb thumb);
	
	// 删除点赞
	Thumb deleteDZ(Thumb thumb);
}
