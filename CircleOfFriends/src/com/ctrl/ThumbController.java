package com.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Comm;
import com.entity.Thumb;
import com.service.ThumbService;

@Controller
@RequestMapping("/thumb")
public class ThumbController {

	@Autowired
	private ThumbService thumbService;
	//点赞
	@RequestMapping("/giveStart.do")
	public  @ResponseBody Comm<Thumb> giveStart(Thumb thumb) {
		Comm<Thumb> thumbComm = new Comm<Thumb>();
		Integer giveStart = thumbService.giveStart(thumb);
		
		if (giveStart > 0) {
			thumbComm.setCode(100);
			thumbComm.setMsg("处理成功");
		}
		
		return thumbComm;
	}
	
	//所有点赞
	@RequestMapping("/whoThumb.do")
	public @ResponseBody Comm<Thumb> whoThumb(Thumb thumb){
		
		Comm<Thumb> thumbComm = new Comm<Thumb>();
		
		List<Thumb> whoThumb = thumbService.whoThumb(thumb);
		
		thumbComm.setCode(100);
		thumbComm.setMsg("处理成功");
		thumbComm.setExtendList(whoThumb);
		
		return thumbComm;
	}
	
	//删除点赞
	@RequestMapping("/deleteDZ.do")
	public @ResponseBody Comm<Thumb> deleteDZ(Thumb thumb){
		Comm<Thumb> thumbComm = new Comm<Thumb>();
		Thumb deleteDZ = thumbService.deleteDZ(thumb);
		if (deleteDZ != null ) {
			thumbComm.setCode(100);
			thumbComm.setMsg("处理成功");
		}
		return thumbComm;
	}
}
