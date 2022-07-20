package com.student.services;

import com.student.entity.Student;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;

//Service start here of student
@Service
public class StudentSImpl implements  StudentService{

    //Fake user List

    List<Student> list = List.of(new Student(1l, "Sourabh Bisht", "746474"),
            new Student(2l, "Nagendra Rana", "647436"),
            new Student(3l, "Akash Rawat", "64748454"));
    @Override
    public Student getStudent(Long id) {
        return this.list.stream().filter(student->student.getStuId().equals(id)).findAny().orElse(null);
    }
}
