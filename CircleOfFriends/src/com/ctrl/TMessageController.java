package com.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Comm;
import com.entity.Revert;
import com.entity.TMessage;
import com.service.TMessageService;

@Controller
@RequestMapping("/tmessage")
public class TMessageController {

	@Autowired
	private TMessageService tMessageService;
	
	@RequestMapping("/insertMessage.do")
	public @ResponseBody Comm<TMessage> insertMessage(TMessage tMessage){
		Comm<TMessage> tmessageComm = new Comm<TMessage>();
		
		Integer insertMessage = tMessageService.insertMessage(tMessage);
		
//		if (insertMessage > 0) {
			tmessageComm.setCode(100);
			tmessageComm.setMsg("处理成功");
//		}
		return tmessageComm;
	}
	
	@RequestMapping("/selectMessage.do")
	public @ResponseBody Comm<TMessage> selectMessage(TMessage tMessage){
		Comm<TMessage> tmessageComm = new Comm<TMessage>();
		
		List<TMessage> selectMessage = tMessageService.selectMessage(tMessage);
		
		if (selectMessage.size() > 0) {
			tmessageComm.setCode(100);
			tmessageComm.setExtendList(selectMessage);
			tmessageComm.setMsg("处理成功");
		}
		
		return tmessageComm;
	}
	
}
