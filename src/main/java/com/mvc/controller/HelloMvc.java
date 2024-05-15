package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloMvc {
	@RequestMapping("/mvc")
	public ModelAndView helloWorld() {

		String message = "Welcome to first Spring MVC hello world Example";
		message += "<br>You Did it....!";

		return new ModelAndView("welcomePage", "welcomeMessage", message);
	}

}
