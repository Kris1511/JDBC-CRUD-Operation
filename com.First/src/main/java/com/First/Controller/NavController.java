package com.First.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.First.Entity.Student;

//@Controller
@RestController
public class NavController {
	
	@GetMapping("/java")
	public String openJava() {
		return "java";
	}
	
	@GetMapping("/python")
	public String openPython() {
		return "python";
	}
	
	@GetMapping("/manageData")
	public String manageDa(@RequestParam String data) {
		return "Data receive: " + data;
	}
	
	@PostMapping("/manageObject")
	public Student manageObj(@RequestBody Student st) {
		return st;
	}

}
