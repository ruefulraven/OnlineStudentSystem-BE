package com.oss.onlinestudentsystem.service;

import com.oss.onlinestudentsystem.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {

    public Student saveStudent(Student student);

    public Student getStudent(Long id);

    public List<Student> getAllStudent();
}
