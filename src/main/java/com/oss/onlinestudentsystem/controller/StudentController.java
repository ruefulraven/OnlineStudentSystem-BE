package com.oss.onlinestudentsystem.controller;


import com.oss.onlinestudentsystem.entity.Student;
import com.oss.onlinestudentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "Student Added   ";
    }

    @GetMapping("/getStudent")
    public Student getStudent(Long id) {
        return studentService.getStudent(id);
    }

    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }
}
