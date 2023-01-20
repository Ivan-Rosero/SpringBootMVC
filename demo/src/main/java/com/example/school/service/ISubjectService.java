package com.example.school.service;

import com.example.school.dto.SubjectDTO;

import java.util.List;

public interface ISubjectService {

    void save(SubjectDTO subjectDTO);

    void update(SubjectDTO subjectDTO);

    SubjectDTO findById(Integer idSubject);

    List<SubjectDTO> findAll();

    void delete(Integer idSubject);
}
