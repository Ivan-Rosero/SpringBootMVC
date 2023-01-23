package com.example.school.service.implement;

import com.example.school.dto.StudentDTO;
import com.example.school.repository.IStudentRepository;
import com.example.school.repository.entity.Student;
import com.example.school.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements IStudentService {

    private final IStudentRepository repositoryStudent;

    public StudentServiceImpl(IStudentRepository repositoryStudent){
        this.repositoryStudent = repositoryStudent;
    }

    @Override
    public String save(StudentDTO studentDTO){
        if(!repositoryStudent.existsById(studentDTO.getIdStudent())){
            repositoryStudent.save(new Student(studentDTO));
            
        }
        return String.format("Se ingresó el estudiante %s con cedula %s", studentDTO.getFnameStudent(), studentDTO.getFnameStudent());
    }

    @Override
    public List<StudentDTO> getAll(){
        List<Student> studentList = (List<Student>) repositoryStudent.findAll();
        return studentList.stream()
                .map(student -> new StudentDTO(student))
                .collect(Collectors.toList());
    }

    @Override
    public String update(StudentDTO studentDTO){
        Optional<Student> valueStudent = repositoryStudent.findById(studentDTO.getIdStudent());
        if(valueStudent.isPresent()){
            repositoryStudent.save(valueStudent.get());
            return "Se actualizó el estudiante";
        }else {
            return "No hay estudiantes con la cedula ingresada";
        }
    }
    
    @Override
    public String delete(Integer idStudent){
        Optional<Student> valueStudent = repositoryStudent.findById(idStudent);
        if(valueStudent.isPresent()){
            repositoryStudent.delete(valueStudent.get());
            return "Se eliminó el estudiante";
        }else{
            return "No existe el estudiante con la cédula ingresada";
        }
    }
    
    //getOneStudent

    @Override
    public Student getStudent(Integer studentId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
