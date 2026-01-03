package com.crud.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.student.Entity.Student;
import java.util.List;


public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	Student findByUsername(String username);
	
	Student findByEmail(String email);

}
