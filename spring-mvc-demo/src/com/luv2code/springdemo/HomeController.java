package com.luv2code.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	// Add Controller Method for the Home page
	@RequestMapping("/")
	public String openHomePage()
	{
		return "home-page";
	}
}
