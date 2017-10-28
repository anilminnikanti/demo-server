package com.mypack.springboot.controller.base;

import org.springframework.web.bind.annotation.RequestMapping;

public abstract class BaseController {
	
	@RequestMapping(path="/")
	public String welcomePage() {
		return "forward:/welcome.html";
	}

}
