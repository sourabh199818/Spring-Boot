package com.student.controller;

import com.student.exception.ResourceNotFoundException;
import com.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.student.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/")
public class StudentController {

@Autowired
private StudentRepository studentRepository;


/* Autowiring service
@Autowired
private StudentGetService studentGetService;
*/


//getting all.employee details
@GetMapping("/student")
public List<Student> getAllEmployees()
{

List<Student> v = studentRepository.findAll();;
return v;
}
///

//calling specific data using id
@GetMapping("/student/{id}")
public ResponseEntity<Student> getsudent(@PathVariable Long id)
{
	Student student = studentRepository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("student not exist with id" +id));

	     return ResponseEntity.ok(student);
}
////






}