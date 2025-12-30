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
		switch(operation) {
//		case 1:
			
		}
		return "result";
	}

}
