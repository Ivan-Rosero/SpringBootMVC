package com.example.school.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;

public class StudentDTO {

    private Integer idStudent;
    private String fnameStudent;
    private String lnameStudent;
    private LocalDate birthDate;
    private Integer age;
    private SubjectDTO subject;

    public StudentDTO(Integer idStudent, String fnameStudent, String lnameStudent, LocalDate birthDate, Integer age, SubjectDTO subject) {
        this.idStudent = idStudent;
        this.fnameStudent = fnameStudent;
        this.lnameStudent = lnameStudent;
        this.birthDate = birthDate;
        this.age = age;
        this.subject = subject;
    }

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

    public SubjectDTO getSubject() {
        return subject;
    }

    public void setSubject(SubjectDTO subject) {
        this.subject = subject;
    }
}
