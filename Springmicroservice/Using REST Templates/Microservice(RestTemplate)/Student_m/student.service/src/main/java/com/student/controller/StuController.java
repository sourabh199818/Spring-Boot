package com.student.controller;


import com.student.entity.Student;
import com.student.services.StudentService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StuController {

    @Autowired
    private StudentService studentService;

    // New learned Code which will call to other service (Rest Template)
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{stuId}")
    public Student getStudent(@PathVariable("stuId") Long stuId)
    {
        // New learned Code which will call to other service (Rest Template)
        Student stu = this.studentService.getStudent(stuId);
        List contacts = this.restTemplate.getForObject
                ("http://localhost:9000/contact/user/"+stu.getStuId(), List.class);
           stu.setContact(contacts);

        return stu;


    }

}
