package com.crud.student.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.student.Entity.Student;
import com.crud.student.Repository.StudentRepo;

@Service
public class StudentServiceImplements implements StudentService{
	
	@Autowired
	StudentRepo repo;

	@Override
	public void registerStudent(Student st) {
		repo.save(st);
	}
	
	public boolean usernameExits(String username) {
		Student st = repo.findByUserName(username);
		
		if (st != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Student loginStudent(int id) {
		return repo.findById(id).get();
	}

}
