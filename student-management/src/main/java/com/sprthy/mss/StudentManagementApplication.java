package com.sprthy.mss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sprthy.mss.entity.Student;
import com.sprthy.mss.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student1= new Student("Ramesh", "Fatad", "ramf@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2= new Student("Raju", "S", "rajus@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3= new Student("Raman", "J", "ramanj@gmail.com");
		 * studentRepository.save(student3);
		 */
	}

}
