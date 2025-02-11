package com.prowings.dao;

import java.util.List;

import com.prowings.entity.Student;

public interface StudentDao {
	
	public void saveStudent(Student std);

	public List<Student> getAllStudents();

	public void updateStudent(Student std);

}
