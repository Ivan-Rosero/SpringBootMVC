package com.example.school.dto;

import com.example.school.repository.entity.Student;
import com.example.school.repository.entity.Subject;
import com.example.school.repository.entity.Teacher;

import java.util.List;
import java.util.stream.Collectors;

public class SubjectDTO {

    private Integer idSubject;
    private String subjectName;
    private List<Student> students;
    private Teacher teacher;
    private String schedule;
    private String topic;

    public SubjectDTO() {
    }
    
    public SubjectDTO(Integer idSubject, String subjectName, String schedule, String topic, List<Student> students, Teacher teacher) {
        this.idSubject = idSubject;
        this.subjectName = subjectName;
        this.schedule = schedule;
        this.topic = topic;
        this.students = students;
        this.teacher = teacher;
    }

    public SubjectDTO(Subject subject){
        this.idSubject = subject.getIdSubject();
        this.subjectName = subject.getSubjectName();
        this.schedule = subject.getSchedule();
        this.topic = subject.getTopic();
        
        this.students = subject.getStudents();
        this.teacher = subject.getTeacher();
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
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
