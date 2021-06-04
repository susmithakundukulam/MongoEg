package com.mongoexample.controller;


import org.springframework.web.bind.annotation.GetMapping;

public interface BaseController {
	
	@GetMapping("/")
	public String Hello();

}
