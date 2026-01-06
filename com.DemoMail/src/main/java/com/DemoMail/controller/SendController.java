package com.DemoMail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.DemoMail.entity.MailEntity;
import com.DemoMail.service.MailService;

@Controller
public class SendController {
	
	@Autowired
	MailService service;
	
	@PostMapping("/sendEmail")
	public String sendEmail(@ModelAttribute MailEntity mail) {
		
		System.out.println(mail);
		
		return "index";
	}

}
