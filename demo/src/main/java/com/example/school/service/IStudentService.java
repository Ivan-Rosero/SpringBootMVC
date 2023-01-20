package com.example.school.service;

import com.example.school.dto.StudentDTO;

import java.util.List;

public interface IStudentService {

    void save(StudentDTO studentDTO);

    void update(StudentDTO studentDTO);

    StudentDTO findById(Integer id);

    List<StudentDTO> findAll();

    void delete(Integer id);
}
