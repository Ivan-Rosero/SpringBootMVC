package com.example.school.dto;

import com.example.school.repository.entity.Teacher;

import java.util.List;
import java.util.stream.Collectors;

public class TeacherDTO {
        private Integer idTeacher;
        private String fnameTeacher;
        private String lnameTeacher;
        private Integer age;
        private List<SubjectDTO> subject;

        public TeacherDTO(Teacher teacher) {
            this.idTeacher = teacher.getIdTeacher();
            this.fnameTeacher = teacher.getFnameTeacher();
            this.lnameTeacher = teacher.getLnameTeacher();
            this.age = teacher.getAgeTeacher();
            this.subject = teacher.getSubject()
                    .stream()
                    .map(SubjectDTO::new)
                    .collect(Collectors.toList());
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<SubjectDTO> getSubject() {
        return subject;
    }

    public void setSubject(List<SubjectDTO> subject) {
        this.subject = subject;
    }
}

