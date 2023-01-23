package com.example.school.controller;

import com.example.school.dto.SubjectDTO;
import com.example.school.service.ISubjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    private final ISubjectService iSubjectService;

    public SubjectController(ISubjectService iSubjectService){
        this.iSubjectService = iSubjectService;
    }

    @GetMapping()
    public ResponseEntity<?> getSubjectAll(){
        return ResponseEntity.ok().body(iSubjectService.getAll());
    }

    @PostMapping("/create")
    public ResponseEntity<?>
    saveSubject(@RequestBody SubjectDTO subject){
        iSubjectService.save(subject);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/modify/{idSubject}")
    public ResponseEntity<?>
    updateSubject(@RequestBody SubjectDTO subject){
        return new ResponseEntity<>(iSubjectService.update(subject), HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{idStudent}")
    public ResponseEntity<?> deleteSubject(@PathVariable Integer idSubject){
        return new ResponseEntity<>(iSubjectService.delete(idSubject), HttpStatus.CREATED);
    }
    
    //@PostMapping para agregar una materia
}
