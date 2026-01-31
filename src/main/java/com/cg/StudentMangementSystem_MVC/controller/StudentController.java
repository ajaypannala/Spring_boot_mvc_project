package com.cg.StudentMangementSystem_MVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.StudentMangementSystem_MVC.Entity.Student;
import com.cg.StudentMangementSystem_MVC.service.StudentService;


@Controller
@RequestMapping("/students")
public class StudentController {
	@Autowired
	StudentService service;
	@GetMapping()
	public String Students(Student s,Model model) {
		model.addAttribute("list", service.getAllStudents(s));
		return "students";
		
	}
	@GetMapping("/add")
	public String AddStudents(Model model) {
		model.addAttribute("student", new Student());
		return "student-form";
	}
	@PostMapping("/save")
	public String SaveStudent(@ModelAttribute ("student") Student s) {
		service.saveStudent(s);
		return "redirect:/students";
		
	}
	@GetMapping("/edit/{id}")
	public String EditStudent(@PathVariable int id,Model model) {
		model.addAttribute(("student"), service.getStudentById(id));
		return "student-form";
		
	}
	@PostMapping("/update/{id}")
	public String updateStudent(@PathVariable int id,Student s) {
		service.updateStudent(id, s);
		return "redirect:/students";
	}
	@GetMapping("delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		service.deleteStudent(id);
		return "students";
	}
	

}
