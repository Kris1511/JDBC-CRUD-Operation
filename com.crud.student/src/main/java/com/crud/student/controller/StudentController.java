package com.crud.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.crud.student.Entity.Student;
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
	public String signup(@ModelAttribute Student st) {
		
		String username = st.getUsername();
		
		boolean uExits = service.usernameExits(username);
		
		if (! uExits) {
			service.registerStudent(st);
			return "signin";
		} else {
			System.out.println("User already exist");
			return "signup";
		}
		
	}
	
	@GetMapping("/opensignin")
	public String singIn() {
		return "signin";
	}
	
	@PostMapping("/signin")
	public String signin() {
		
		return "";
		
	}

}
