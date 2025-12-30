package com.First.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalciController {
	
	@GetMapping("/calc")
	public String calci(@RequestParam int num1, 
						@RequestParam int num2, 
						@RequestParam String operation, 
						Model m) {
		System.out.println("request received");
		
		int result = 0;
		
		if (operation.equals("add")) {
			result = num1 + num2;
		} else if (operation.equals("sub")) {
			result = num1 - num2;
		} else if (operation.equals("mul")) {
			result = num1 * num2;
		} else if (operation.equals("div")) {
			result = num1 / num2;
		} else {
			System.out.println("Invalid operation");
		}
		
		m.addAttribute("result", result);	
		return "result";
	}

}
