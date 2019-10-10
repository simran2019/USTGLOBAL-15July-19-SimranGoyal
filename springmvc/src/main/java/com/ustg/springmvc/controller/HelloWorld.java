package com.ustg.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloWorld {

	@RequestMapping(method= RequestMethod.GET)
	public String getHello() {
		return "index";
	}
}
