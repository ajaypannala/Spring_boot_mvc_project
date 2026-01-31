package com.cg.StudentMangementSystem_MVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.StudentMangementSystem_MVC.Entity.Student;
import com.cg.StudentMangementSystem_MVC.repository.StudentRepository;
@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	StudentRepository repo;

	@Override
	public List<Student> getAllStudents(Student s) {
		return repo.findAll();
	
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void saveStudent(Student s) {
		repo.save(s);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student updateStudent(int id, Student s) {
		
		Student s1=repo.findById(id).get();
		s1.setName(s.getName());
		s1.setEmail(s.getEmail());
		s1.setMob_num(s1.getMob_num());
		return repo.save(s1);
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteStudent(int id) {
		Student s=repo.findById(id).get();
		repo.delete(s);
		// TODO Auto-generated method stub
		
	}

}
