package com.crud.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.employee.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
