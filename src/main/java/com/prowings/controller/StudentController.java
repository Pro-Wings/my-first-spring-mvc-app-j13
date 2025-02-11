
package com.prowings.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.prowings.entity.Student;
import com.prowings.service.StudentService;

@Controller
public class StudentController {

	@Autowired	
	StudentService studentService; 

	@PostMapping("/student")
	public String createStudent(HttpServletRequest httpRequest, HttpServletResponse httpResponse, Model model) {

		System.out.println(">>>> create student request received!!");

		Student s = new Student();
		s.setName(httpRequest.getParameter("name"));
		s.setAddress(httpRequest.getParameter("address"));
		System.out.println(">>>>>> Student Details :" + s);
		//call service layer to save student
		studentService.createStudent(s);
		model.addAttribute("std", s);

		return "renderStudent";
	}

	@GetMapping("/getAllStudents")
	public String getAllStudents(Model model) {
		System.out.println(">>>> get all students request received!!");
		// call service layer to get all students
		 List<Student> studentsList = studentService.getAllStudents();
		 model.addAttribute("studentsList", studentsList);
		return "renderStudents";
	}

	@PostMapping("/updateStudent")
	public String updateStudent(HttpServletRequest httpRequest, HttpServletResponse httpResponse, Model model) {
		System.out.println(">>>> update student request received!!");
        Student s = new Student();
        s.setId(Integer.parseInt(httpRequest.getParameter("id")));
        s.setName(httpRequest.getParameter("name"));
        s.setAddress(httpRequest.getParameter("address"));
        // call service layer to update student
        studentService.updateStudent(s);
        model.addAttribute("std", s);
        return "renderStudent";
	}
}
