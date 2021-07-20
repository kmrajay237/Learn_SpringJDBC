package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface StudentDAO {
	
	public int insert(Student student);
	public int change(Student student);
	public int delete(int studentid);
	public Student getStudent(int studentid);
	public List<Student> getAllStudents();

}
