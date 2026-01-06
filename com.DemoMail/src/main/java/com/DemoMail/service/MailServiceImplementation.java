package com.DemoMail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DemoMail.repository.MailRepo;

@Service
public class MailServiceImplementation implements MailService {
	
	@Autowired
	MailRepo repo;

}
