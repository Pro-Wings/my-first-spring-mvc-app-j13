package com.prowings.service;

import java.util.List;

import com.prowings.entity.Student;

public interface StudentService {
	
	public void createStudent(Student std);

	public List<Student> getAllStudents();
	
	public void updateStudent(Student std);
}
