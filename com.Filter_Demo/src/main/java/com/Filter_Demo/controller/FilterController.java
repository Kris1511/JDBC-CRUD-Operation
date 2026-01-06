package com.Filter_Demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class FilterController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	@GetMapping("/hi")
	public String hi() {
		return "Hello";
	}

}
