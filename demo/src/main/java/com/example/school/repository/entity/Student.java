package com.example.school.repository.entity;

import com.example.school.dto.StudentDTO;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.Period;

@Entity
public class Student {

    @Id
    private Integer idStudent;

    @Column(name = "FIRST_NAME", nullable = false)
    private String fnameStudent;

    @Column(name = "LAST_NAME", nullable = false)
    private String lnameStudent;

    @Column(name = "BIRTH_DATE", nullable = false)
    private LocalDate birthDate;

    @Column(name = "AGE", nullable = false)
    private Integer age;

    @Column(nullable = false)
    private String subject;

    public Student() {
    }

    public Student(Integer idStudent, String fnameStudent, String lnameStudent, LocalDate birthDate, Integer age, String subject) {
        this.idStudent = idStudent;
        this.fnameStudent = fnameStudent;
        this.lnameStudent = lnameStudent;
        this.birthDate = birthDate;
        this.age = calculateAge();
        this.subject = subject;
    }

    public Student(StudentDTO studentDTO){

    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setId(Integer idStudent) {
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

    public Integer calculateAge(){
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
