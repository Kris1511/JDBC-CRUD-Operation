package com.crud.student.Service;

import com.crud.student.Entity.Student;

public interface StudentService {
	
	void registerStudent(Student st);
	
	boolean usernameExist(String username);
	
	Student loginStudent(String email);

}
