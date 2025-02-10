
package com.prowings.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.prowings.entity.Student;

@Controller
public class StudentController {

    @GetMapping("/student/{stdId}")
    public String getStudentById(@PathVariable int stdId, Model model) {
        System.out.println(">>>> get student by id request received for Student Id = " + stdId);

        // go to DB then find student by id
        Student s = new Student();
        s.setId(10);
        s.setName("Ram");
        s.setAddress("Pune");

        model.addAttribute("std", s);

        return "renderStudent";
    }

    @GetMapping("/students")
    public String getAllStudent(Model model) {
        System.out.println(">>>> get all students request received...");

        // go to DB then find student by id
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

    @PostMapping("/student")
    public String createStudent(HttpServletRequest httpRequest, HttpServletResponse httpResponse,  Model model) {

    	System.out.println(">>>> create student request received!!");

    	Student s = new Student();
    	
//        Integer id = Integer.parseInt(httpRequest.getParameter("id"));
//        s.setId(id);
        s.setName(httpRequest.getParameter("name"));
        s.setAddress(httpRequest.getParameter("address"));

        System.out.println(">>>>>> Student Details :"+s);
        
        //call service->dao->db
        
        model.addAttribute("std", s);

        return "renderStudent";
    }

    @PutMapping("/student/{stdId}")
    public String updateStudent(@PathVariable int stdId, @RequestBody Student student, Model model) {
        System.out.println(">>>> update student request received for Student Id = " + stdId);

        // go to DB and update the student
        student.setId(stdId);

        model.addAttribute("std", student);

        return "renderStudent";
    }

    @DeleteMapping("/student/{stdId}")
    public String deleteStudent(@PathVariable int stdId, Model model) {
        System.out.println(">>>> delete student request received for Student Id = " + stdId);

        // go to DB and delete the student by id

        model.addAttribute("message", "Student with ID " + stdId + " deleted successfully");

        return "deleteConfirmation";
    }
}
