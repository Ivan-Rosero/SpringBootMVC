package com.example.school.service;

import com.example.school.dto.SubjectDTO;
import com.example.school.dto.TeacherDTO;

import java.util.List;

public interface ITeacherService {
    String save(TeacherDTO teacherDTO);

    String update(TeacherDTO teacherDTO);

    TeacherDTO findById(Integer idTeacher);

    List<TeacherDTO> getAll();

    String delete(Integer idTeacher);
    
    String setSubject(SubjectDTO subjectDTO, Integer subjectId);
}
