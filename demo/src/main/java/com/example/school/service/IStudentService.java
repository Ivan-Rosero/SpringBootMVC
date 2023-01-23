package com.example.school.service;

import com.example.school.dto.StudentDTO;
import com.example.school.repository.entity.Student;

import java.util.List;

public interface IStudentService {

    String save(StudentDTO studentDTO);

    String update(StudentDTO studentDTO);

    List<StudentDTO> getAll();

    String delete(Integer studentId);
    
    Student getStudent(Integer studentId);
}
