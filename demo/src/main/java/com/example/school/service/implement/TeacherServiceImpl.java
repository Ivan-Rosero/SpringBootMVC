package com.example.school.service.implement;

import com.example.school.dto.SubjectDTO;
import com.example.school.dto.TeacherDTO;
import com.example.school.repository.ISubjectRepository;
import com.example.school.repository.ITeacherRepository;
import com.example.school.repository.entity.Teacher;
import com.example.school.service.ITeacherService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements ITeacherService {

    private final ITeacherRepository repositoryTeacher;
    private final ISubjectRepository repositorySubject;

    public TeacherServiceImpl(ITeacherRepository repositoryTeacher, ISubjectRepository repositorySubject) {
        this.repositoryTeacher = repositoryTeacher;
        this.repositorySubject = repositorySubject;
    }

    @Override
    public String save(TeacherDTO teacherDTO){
        if(!repositoryTeacher.existsById(teacherDTO.getIdTeacher())){
            repositoryTeacher.save(new Teacher(teacherDTO));
        }
        return "Se guardó el profesor exitosamente";
    }

    @Override
    public List<TeacherDTO> getAll(){
        List<Teacher> teacherList = (List<Teacher>) repositoryTeacher.findAll();
        return teacherList.stream().map(TeacherDTO::new).collect(Collectors.toList());
    }

    @Override
    public String update(TeacherDTO teacherDTO){
        Optional<Teacher> valueTeacher = repositoryTeacher.findById(teacherDTO.getIdTeacher());
        if(valueTeacher.isPresent()){
            
            repositoryTeacher.save(valueTeacher.get());
            return "Se actualizó el profesor correctamente";
        }else {
            return "No se encontró profesor";
        }
    }
    
    @Override
    public String delete(Integer idTeacher){
        Optional<Teacher> valueTeacher = repositoryTeacher.findById(idTeacher);
        if(valueTeacher.isPresent()){
            repositoryTeacher.deleteById(idTeacher);
            return "Se eliminó profesor correctamente";
        } else {
            return "No existe el profesor con la información ingresada";
        }
    }

    @Override
    public TeacherDTO findById(Integer idTeacher) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String setSubject(SubjectDTO subjectDTO, Integer subjectId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
 
}
