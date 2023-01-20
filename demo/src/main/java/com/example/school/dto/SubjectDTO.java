package com.example.school.dto;

import com.example.school.repository.entity.Student;
import com.example.school.repository.entity.Subject;

import java.util.List;
import java.util.stream.Collectors;

public class SubjectDTO {

    private Integer idSubject;
    private List<Student> students;
    private TeacherDTO teacher;
    private String schedule;
    private String topic;

    public SubjectDTO(Subject subject){
        this.idSubject = subject.getIdSubject();
        this.students = subject.getStudents().stream().map(StudentDTO::new).collect(Collectors.toList());
        this.teacher = new TeacherDTO(subject.getTeacher());
        this.schedule = subject.getSchedule();
        this.topic = subject.getTopic();
    }

    public Integer getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Integer idSubject) {
        this.idSubject = idSubject;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public TeacherDTO getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherDTO teacher) {
        this.teacher = teacher;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
