package com.cg.StudentMangementSystem_MVC.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private long mob_num;
	public Student(int id, String name, String email, long mob_num) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mob_num = mob_num;
	}
	public Student() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMob_num() {
		return mob_num;
	}
	public void setMob_num(long mob_num) {
		this.mob_num = mob_num;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", mob_num=" + mob_num + "]";
	}
	

}
