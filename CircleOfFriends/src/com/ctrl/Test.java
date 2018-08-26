package com.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {
	
	@RequestMapping("/test.do")
	public void test(){

		System.out.println("test test test");
	}

}
