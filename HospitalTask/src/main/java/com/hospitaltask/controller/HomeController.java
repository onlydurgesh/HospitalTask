package com.hospitaltask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/hm")
public class HomeController {

	@GetMapping(value = "/home")
	String homePage()
	{
		return "index";
	}

}
