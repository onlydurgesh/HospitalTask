package com.hospitaltask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/hm")
public class HomeController {

	@GetMapping("/home")
	String homePage() {
		System.out.println("this is login Page ");
		return "Home";
	}

	@GetMapping("/login-pa")
	String login() {
		System.out.println("this is login Page ");
		return "login";
	}
	@GetMapping("/create-new")
	String createNew() {
		System.out.println("this is login Page ");
		return "createNew";
	}

}
