package com.example.school.controller;

import com.example.school.dto.TeacherDTO;
import com.example.school.service.ITeacherService;
//import com.example.school.service.implement.TeacherServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/teacher")
public class TeacherController {

    private final ITeacherService iTeacherService;

    public TeacherController(ITeacherService iTeacherService){
        this.iTeacherService = iTeacherService;
    }

    @GetMapping()
    public ResponseEntity<?> getTeacherAll(){
        return ResponseEntity
                .ok()
                .body(iTeacherService.getAll());

    }

    @PostMapping("/create")
    public ResponseEntity<?>
    saveTeacher(@RequestBody TeacherDTO teacherDTO){
        iTeacherService.save(teacherDTO);
        return  new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/modify/{idTeacher}")
    public ResponseEntity<?>
    updatePerson(@RequestBody TeacherDTO teacherDTO){
        return new ResponseEntity<>(iTeacherService.update(teacherDTO), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{idTeacher}")
    public ResponseEntity<?> deleteTeacher(@PathVariable Integer idTeacher){
        return new ResponseEntity(iTeacherService.delete(idTeacher), HttpStatus.CREATED);
    }
    
    //PostMapping to modify subjects


}
