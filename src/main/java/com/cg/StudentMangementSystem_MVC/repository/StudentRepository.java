package com.cg.StudentMangementSystem_MVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.StudentMangementSystem_MVC.Entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
