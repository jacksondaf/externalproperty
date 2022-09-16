package com.javainterviewpoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javainterviewpoint.config.HelloConfig;

@RestController
public class HelloController
{
	@Autowired
	HelloConfig helloConfig;
	
	@GetMapping("/hello")
	public String welcome() {
		return "Welcome - Property Value : "+helloConfig.getProperty1();
	}
}
