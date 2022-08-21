/*package com.student.service;

import com.student.exception.ResourceNotFoundException;
import com.student.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class StudentGetService implements getstudent {

@Override
    public List<Student> GetStudent Long<id>

    {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("student not exist with id" +id));
        return ResponseEntity.ok(student);
}
*/