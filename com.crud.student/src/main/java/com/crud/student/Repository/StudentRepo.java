package com.crud.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.student.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	Student findByUserName(String username);

}
