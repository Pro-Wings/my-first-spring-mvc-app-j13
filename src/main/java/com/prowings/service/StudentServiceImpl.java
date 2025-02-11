package com.prowings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prowings.dao.StudentDao;
import com.prowings.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDao studentDao;

	@Override
	public void createStudent(Student std) {
		System.out.println(">>>>> StudentServiceImpl.createStudent() called!!");
		studentDao.saveStudent(std);
		System.out.println(">>>>> StudentServiceImpl.createStudent() ended!!");

	}

	@Override
	public List<Student> getAllStudents() {
		System.out.println(">>>>> StudentServiceImpl.getAllStudents() called!!");
		List<Student> students = studentDao.getAllStudents();
		System.out.println(">>>>> StudentServiceImpl.getAllStudents() ended!!");
		return students;
	}

	@Override
	public void updateStudent(Student std) {
		
		System.out.println(">>>>> StudentServiceImpl.updateStudent() called!!");
		studentDao.updateStudent(std);
		System.out.println(">>>>> StudentServiceImpl.updateStudent() ended!!");
		
	}

}
