package com.learn.springbootstudrepository.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.springbootstudrepository.entity.Student;
import com.learn.springbootstudrepository.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studRepository;
	
	public List<Student> getAllStudent()
	{
		return (List<Student>) studRepository.findAll();
	}
	
	
	public void addStudent(Student student)
	{
		studRepository.save(student);
	}
	
	public Optional<Student> getStudent(int studentId)
	{
		return studRepository.findById(studentId);
	}
	
	public Student updateStudent(Student student)
	{
		
		return studRepository.save(student);
	}
	
	public void delete()
	{
		studRepository.deleteAll();
	}
	
	public void deleteStudent(int studentId)
	{
		studRepository.deleteById(studentId);
	}

	
	

}
