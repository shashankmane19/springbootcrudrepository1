package com.learn.springbootstudrepository.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springbootstudrepository.entity.Student;
import com.learn.springbootstudrepository.service.StudentService;



@RestController
@RequestMapping("/student")


public class StudentController {
	
	@Autowired
	StudentService studentservice;
	
	
	@PostMapping("/")
	public String addStudent(@RequestBody Student student)
	{
		studentservice.addStudent(student);
		return "Student Added";
	}
	
	
	@GetMapping("/")
	public List<Student> getAllStudent()
	{
		return (List<Student>)  studentservice.getAllStudent();
	}
	
	@GetMapping("/{studentId}")
	public Optional<Student> getStudent(@PathVariable int studentId)
	{
		return  studentservice.getStudent(studentId);
	}
	
	
	@PutMapping("/")
	public Student updateStudent(@RequestBody Student student)
	{
		return studentservice.updateStudent(student);
		
	}
	
	@DeleteMapping("/")
	public String deleteAll()
	{
		studentservice.delete();
		return "All Details Deleted";
	}
	
	@DeleteMapping("/{studentId}")
	public String delete(@PathVariable int studentId)
	{
		studentservice.deleteStudent(studentId);
		return "Student deleted";
	}

	
	

}
