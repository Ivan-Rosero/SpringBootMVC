package com.example.school.repository.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Teacher {

    @OneToMany(mappedBy = "TEACHER", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Subject> subject;

    @Id
    private Integer idTeacher;

    @Column(name = "FIRST_NAME", nullable = false)
    private String fnameTeacher;

    @Column(name = "LAST_NAME", nullable = false)
    private String lnameTeacher;

    @Column(name= "AGE", nullable = false)
    private Integer ageTeacher;

    public Teacher() {
    }

    public Teacher(List<Subject> subject, Integer idTeacher, String fnameTeacher, String lnameTeacher, Integer ageTeacher) {
        this.subject = subject;
        this.idTeacher = idTeacher;
        this.fnameTeacher = fnameTeacher;
        this.lnameTeacher = lnameTeacher;
        this.ageTeacher = ageTeacher;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(List<Subject> subject) {
        this.subject = subject;
    }

    public Integer getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(Integer idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getFnameTeacher() {
        return fnameTeacher;
    }

    public void setFnameTeacher(String fnameTeacher) {
        this.fnameTeacher = fnameTeacher;
    }

    public String getLnameTeacher() {
        return lnameTeacher;
    }

    public void setLnameTeacher(String lnameTeacher) {
        this.lnameTeacher = lnameTeacher;
    }

    public Integer getAgeTeacher() {
        return ageTeacher;
    }

    public void setAgeTeacher(Integer ageTeacher) {
        this.ageTeacher = ageTeacher;
    }
}
