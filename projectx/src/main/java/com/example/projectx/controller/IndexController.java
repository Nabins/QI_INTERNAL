package com.example.projectx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String  Index() {
		System.out.println("hello world");
		return "/index";
	}
	
	
	@RequestMapping(value = "/underconst",method = RequestMethod.GET)
	public String  UnderCOnstruction() {
		System.out.println("hello from under construction");
		return "/underconst";
	}
	

}
