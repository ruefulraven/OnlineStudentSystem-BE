package com.oss.onlinestudentsystem.service;

import com.oss.onlinestudentsystem.entity.Student;
import com.oss.onlinestudentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository  studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudent(Long id) {
        return studentRepository.getReferenceById(id);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
