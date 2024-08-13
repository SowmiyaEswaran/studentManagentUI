package com.springajax.sms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springajax.sms.entity.Student;

@Service
public interface StudentService {
	List<Student> getAllStudents();

	void addStudent(Student student);

	Student getStudent(Long id);
	
	Student updateStudent(Student student);

	void deleteStudent(Long id);

}
