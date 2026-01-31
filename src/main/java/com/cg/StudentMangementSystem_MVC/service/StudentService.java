package com.cg.StudentMangementSystem_MVC.service;

import java.util.List;

import com.cg.StudentMangementSystem_MVC.Entity.Student;

public interface StudentService {
	public List<Student> getAllStudents(Student s);
	public Student getStudentById(int id);
	public void saveStudent(Student s);
	public Student updateStudent(int id,Student s);
	public void deleteStudent(int id);
	

}
