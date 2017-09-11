package com.example.testapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	
	@RequestMapping("/")
	public String greeting() {
		return "<h1>Hi i am docker....Awesome</h1>";
	}

}
