package com.example.school.controller;

import com.example.school.dto.StudentDTO;
import com.example.school.service.IStudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final IStudentService iStudentService;

    public StudentController(IStudentService iStudentService){
        this.iStudentService = iStudentService;
    }

    @GetMapping()
    public ResponseEntity <?> getStudentAll(){
        return ResponseEntity.ok().body(iStudentService.getAll());
    }

    @PostMapping("/create")
    public ResponseEntity<?>
    saveStudent(@RequestBody StudentDTO student){
        iStudentService.save(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/modify/{idStudent}")
    public ResponseEntity<?>
    updateStudent(@RequestBody StudentDTO studentDTO){
        return new ResponseEntity<>(iStudentService.update(studentDTO), HttpStatus.CREATED );
    }
    
    @DeleteMapping("/delete/{idStudent}")
    public ResponseEntity<?>
    deleteStudent(@PathVariable Integer idStudent){
        return new ResponseEntity<>(iStudentService.delete(idStudent), HttpStatus.CREATED);
    }
    
    //GettMapping para mostrar un estudiante
}
