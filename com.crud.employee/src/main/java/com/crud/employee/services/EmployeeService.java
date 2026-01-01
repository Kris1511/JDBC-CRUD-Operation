package com.crud.employee.services;

import java.util.List;

import com.crud.employee.entities.Employee;

public interface EmployeeService {
	
	void addEmployee(Employee emp);
	
	void updateEmployee(Employee emp);
	
	Employee searchEmployee(int id);
	
	void deleteEmployee(int id);
	
	List<Employee> fetchEmployee();

}
