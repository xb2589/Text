package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ThumbDao;
import com.entity.Comm;
import com.entity.Thumb;
import com.entity.User;
import com.service.ThumbService;

@Service
public class ThumbServiceImpl implements ThumbService {

	@Autowired
	private ThumbDao thumbDao;

	@Override
	public Integer giveStart(Thumb thumb) {
		// TODO Auto-generated method stub
		Integer giveStart = thumbDao.giveStart(thumb);
		return giveStart;
	}

	@Override
	public List<Thumb> whoThumb(Thumb thumb) {
		// TODO Auto-generated method stub
		List<Thumb> whoThumb = thumbDao.whoThumb(thumb);
		return whoThumb;
	}

	@Override
	public Thumb deleteDZ(Thumb thumb) {
		// TODO Auto-generated method stub
		Thumb deleteDZ = thumbDao.deleteDZ(thumb);
		return deleteDZ;
	}

	


}
