package com.forest.dandan.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.forest.dandan.services.IUserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="index")
	private String index(){
		userService.findAll().forEach(a->System.err.println(a));
		return "index";
	}
	
}
