package com.sprthy.mss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprthy.mss.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	
}
