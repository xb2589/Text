package com.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Comm;
import com.entity.Revert;
import com.service.RevertService;

@Controller
@RequestMapping("/revert")
public class RevertController {

	@Autowired
	private RevertService revertService;
	
	@RequestMapping("/insertRevert.do")
	public @ResponseBody Comm<Revert> insertRevert(Revert revert) {
		Comm<Revert> revertComm = new Comm<Revert>();
		
		Integer insertRevert = revertService.insertRevert(revert);
		
		if (insertRevert > 0) {
			revertComm.setCode(100);
			revertComm.setMsg("处理成功");
		}
		
		return revertComm;
	}
}
