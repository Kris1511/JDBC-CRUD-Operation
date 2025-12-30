package com.First.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class NavController {
	
//	@GetMapping("/greet")
//	public String greet() {
//		return "greet";
//	}
	
	@GetMapping("/greet")
	public String greetData(Model m) {
		m.addAttribute("Greeting", "Hello from model");
		return "greet";
	}

}
