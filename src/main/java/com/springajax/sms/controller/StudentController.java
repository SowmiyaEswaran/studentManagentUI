package com.springajax.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.springajax.sms.entity.Student;
import com.springajax.sms.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
		
	}
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		Student student= new Student();
		model.addAttribute("student", student);
		return "create_student";
	}
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student")Student student) {
		studentService.addStudent(student);
		return "redirect:/students";
	}
	@GetMapping("/students/edit/{id}")
	public String editStudent(@PathVariable Long id, Model model) {
		model.addAttribute("student",studentService.getStudent(id));
		
		return "edit_student";
		
	}
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student")Student student, Model model) {
		Student stu= studentService.getStudent(id);
		stu.setId(id);
		stu.setFirstName(student.getFirstName());
		stu.setLastName(student.getLastName());
		stu.setEmail(student.getEmail());
		studentService.updateStudent(stu);		
		return "redirect:/students";
		
	}
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id,Model model) {
		studentService.deleteStudent(id);
		return "redirect:/students";
	}
}
