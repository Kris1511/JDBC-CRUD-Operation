package com.crud.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.crud.student.Entity.Student;
import com.crud.student.Entity.UserLogin;
import com.crud.student.Service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/opensignup")
	public String singUp() {
		return "signup";
	}
	
	@PostMapping("/register")
	public String signup(@ModelAttribute Student st, Model m) {
		
		String username = st.getUsername();
		
		boolean uExits = service.usernameExist(username);
		
		if (! uExits) {
			service.registerStudent(st);
			m.addAttribute("msg", "User register successfully.");
			return "signin";
		} else {
			m.addAttribute("msg", "User already exist.");
			return "signup";
		}
		
	}
	
	@GetMapping("/opensignin")
	public String singIn() {
		return "signin";
	}
	
	@PostMapping("/signin")
	public String signin(@ModelAttribute UserLogin data, Model m) {
			Student st = service.loginStudent(data.getEmail());
			
			if (st != null) {
				if (data.getPassword().equals(st.getPassword())) {
					return "success";
				} 
			}
			m.addAttribute("errMsg", "Wrong credentials!");
				return "signin";		
	}
	
	// not standard way to write the code @RequestParam
//	@PostMapping("/signin")
//	public String signin(@RequestParam String email, @RequestParam String password) {
//			Student st = service.loginStudent(email);
//			
//			if (password.equals(st.getPassword())) {
//				return "success";
//			} else {
//				return "fail";				
//			}		
//	}

}
