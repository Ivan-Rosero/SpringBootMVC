package com.example.school.repository.entity;

import com.example.school.dto.StudentDTO;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.Period;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Student {

    @Id
    
    @Column (name = "ID_STUDENT", unique = true)
    private Integer idStudent;

    @Column(name = "FIRST_NAME", nullable = false)
    private String fnameStudent;

    @Column(name = "LAST_NAME", nullable = false)
    private String lnameStudent;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Column(name = "BIRTH_DATE", nullable = false)
    private LocalDate birthDate;

    @Column(name = "AGE")
    private Integer age;

    @ManyToOne(fetch = FetchType.LAZY)//toma varios datos y fetchtype lazy se usa para solicitarlos a petición
    @Column(nullable = false)
    private Subject subject;

    public Student() {
    }

    public Student(Integer idStudent, String fnameStudent, String lnameStudent, LocalDate birthDate, Integer age, Subject subject) {
        this.idStudent = idStudent;
        this.fnameStudent = fnameStudent;
        this.lnameStudent = lnameStudent;
        this.birthDate = birthDate;
        this.age = age;
        this.subject = subject;
    }
    
    public Student(StudentDTO studentDTO){
        this.idStudent = studentDTO.getIdStudent();
        this.fnameStudent = studentDTO.getFnameStudent();
        this.lnameStudent = studentDTO.getLnameStudent();
        this.birthDate = studentDTO.getBirthDate();
        this.age = studentDTO.getAge();
        this.subject = new Subject(studentDTO.getSubject());
    }

    //Getters and Setters
    
    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public String getFnameStudent() {
        return fnameStudent;
    }

    public void setFnameStudent(String fnameStudent) {
        this.fnameStudent = fnameStudent;
    }

    public String getLnameStudent() {
        return lnameStudent;
    }

    public void setLnameStudent(String lnameStudent) {
        this.lnameStudent = lnameStudent;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //age calculator

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    
}
