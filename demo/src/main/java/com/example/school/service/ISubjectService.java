package com.example.school.service;

import com.example.school.dto.SubjectDTO;

import java.util.List;

public interface ISubjectService {

    String save(SubjectDTO subjectDTO);

    String update(SubjectDTO subjectDTO);

    List<SubjectDTO> getAll();

    String delete(Integer idSubject);
    
    

}
