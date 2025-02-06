package com.prowings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public String greet(Model model)
	{
		model.addAttribute("message", "Welcome to my first Spring MVC application!!");
		return "home";
	}

}
