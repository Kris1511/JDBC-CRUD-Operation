package com.crud.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.crud.employee.entities.Employee;
import com.crud.employee.services.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	// add employee
	@GetMapping("/addEmp")
	public String add() {
		return "add_employee";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute Employee emp) {
		service.addEmployee(emp);
		
		return "success";
	}
	
	// update employee
	@GetMapping("/updateEmp")
	public String openUpdate() {
		return "update_emp";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute Employee emp) {
		service.updateEmployee(emp);
		
		return "update";
	}
	
	// search employee
	@GetMapping("/searchEmp")
	public String searchEmployee() {
		return "search";
	}
	
	@PostMapping("/searchEmployee")
	public String search(@RequestParam int id, Model m) {
		Employee emp = service.searchEmployee(id);
		m.addAttribute("emp", emp);
		
		return "searchEmp";
	}
	
	//delete employee
	@GetMapping("/deleteEmp")
	public String deleteEmployee() {
		return "delete";
	}
	
	@PostMapping("/deleteEmployee")
	public String deleteEmp(@RequestParam int id) {
		service.deleteEmployee(id);
		
		return "deleteMessage";
	}
	
	// fetch all employee
	@GetMapping("/fetchEmp")
	public String fetchEmp(Model m) {
		List<Employee> empList = service.fetchEmployee();
		m.addAttribute("fetch", empList);
		
		return "fetchResult";
	}

}
