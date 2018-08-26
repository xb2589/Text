package com.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Comm;
import com.entity.User;
import com.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	// 注册
	@RequestMapping("/register.do")
	public @ResponseBody Comm<User> register(User user) {

		Integer register = userService.register(user);
		
		Comm<User> retuComm = new Comm<User>();
		
		if(register != null && !"".equals(register)){
			retuComm.setCode(100);
			retuComm.setMsg("处理成功");
			retuComm.setExtend(null);
		}
		return retuComm;

	}

	// 登录
	@RequestMapping("/login.do")
	public @ResponseBody Comm<User> login(User user) {


		User login = userService.login(user);
		
		Comm<User> retuComm = new Comm<User>();

		if (login != null ) {
			retuComm.setCode(100);
			retuComm.setMsg("处理成功");
			retuComm.setExtend(login);
		}

		return retuComm;
	}

	// 用户名是否重复
	@SuppressWarnings("unused")
	@RequestMapping("/isRepeat.do")
	public @ResponseBody Comm<User> isRepeat(User user) {

		User isRepeat = userService.isRepeat(user);
		
		Comm<User> retuComm = new Comm<User>();;
		
		
		if(isRepeat == null){ // isRepeat == null 不存在此账号
			retuComm.setCode(100);
			retuComm.setMsg("处理成功");
			retuComm.setExtend(isRepeat);
		}
		
		return retuComm;
		
	}
}
