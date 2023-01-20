package com.example.school.service;

import com.example.school.dto.TeacherDTO;

import java.util.List;

public interface ITeacherService {
    void save(TeacherDTO teacherDTO);

    void update(TeacherDTO teacherDTO);

    TeacherDTO findById(Integer id);

    List<TeacherDTO> findAll();

    void delete(Integer id);
}
