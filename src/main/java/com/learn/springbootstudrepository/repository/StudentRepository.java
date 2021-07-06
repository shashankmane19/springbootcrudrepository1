package com.learn.springbootstudrepository.repository;

import org.springframework.data.repository.CrudRepository;

import com.learn.springbootstudrepository.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

	

}
