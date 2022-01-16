package com.sprthy.mss.service;

import java.util.List;

import com.sprthy.mss.entity.Student;

public interface StudentService {

	List<Student> getallStudents();
	Student saveStudent(Student student);
	Student updateStudent(Student student);
	Student getStudentById(Long id);
	void deleteStudentById(Long id);
}
