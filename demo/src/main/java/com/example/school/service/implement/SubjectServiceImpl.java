package com.example.school.service.implement;

import com.example.school.dto.SubjectDTO;
import com.example.school.dto.TeacherDTO;
import com.example.school.repository.ISubjectRepository;
import com.example.school.repository.entity.Subject;
import com.example.school.service.ISubjectService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SubjectServiceImpl implements ISubjectService {

    private final ISubjectRepository repositorySubject;

    public SubjectServiceImpl(ISubjectRepository repositorySubject) {
        this.repositorySubject = repositorySubject;
    }

    @Override
    public String save(SubjectDTO subjectDTO) {
        if (!repositorySubject.existsById(subjectDTO.getIdSubject())) {
            repositorySubject.save(new Subject(subjectDTO));
        }
        return "Se creó la materia";
    }

    @Override
    public List<SubjectDTO> getAll() {
        List<Subject> subjectList = (List<Subject>) repositorySubject.findAll();
        return subjectList.stream()
                .map(SubjectDTO::new)
                .collect(Collectors.toList());
    }

    //Override?
    public String update(SubjectDTO subjectDTO, Integer idSubject) {
        Optional<Subject> valueSubject = repositorySubject.findById(idSubject);
        if (valueSubject.isPresent()) {
            repositorySubject.save(valueSubject.get());
            return "Se actualizó la información de la materia";
        } else {
            return "No existe materia";
        }
    }

    @Override
    public String delete(Integer idSubject) {
        Optional<Subject> valueSubject = repositorySubject.findById(idSubject);
        if (valueSubject.isPresent()) {
            repositorySubject.deleteById(idSubject);
            return "Se eliminó la materia";
        } else {
            return "No se encontró materia";
        }
    }

    @Override
    public String update(SubjectDTO subjectDTO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
