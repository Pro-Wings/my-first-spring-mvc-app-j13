package com.prowings.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.prowings.entity.Student;

@Controller
public class StudentController {
	
	@GetMapping("/student/{stdId}")
	public String getStudentById(@PathVariable int stdId, Model model)
	{
		System.out.println(">>>> get student by id request received for Student Id = "+stdId);
		
		//go to DB then find student by id
		Student s = new Student();
		s.setId(10);
		s.setName("Ram");
		s.setAddress("Pune");
		
		model.addAttribute("std", s);

		return "renderStudent";
	}

	@GetMapping("/students")
	public String getAllStudent(Model model)
	{
		System.out.println(">>>> get all students request received...");
		
		//go to DB then find student by id
		Student s1 = new Student();
		s1.setId(10);
		s1.setName("Ram");
		s1.setAddress("Pune");

		Student s2 = new Student();
		s2.setId(20);
		s2.setName("Sham");
		s2.setAddress("Mumbai");
		
		List<Student> fetchedStdList = new ArrayList<>();
		fetchedStdList.add(s1);
		fetchedStdList.add(s2);
		
		model.addAttribute("stdlist", fetchedStdList);
		
		return "renderStudents";
	}

}
