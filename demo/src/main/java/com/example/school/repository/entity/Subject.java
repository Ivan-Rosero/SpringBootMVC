package com.example.school.repository.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Subject {

    @Id
    private Integer idSubject;
    @OneToMany(mappedBy = "SUBJECT", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Student> students;

    @Column(nullable = false)
    private String teacher;

    @Column(nullable = false)
    private String Student;

    @Column(name = "SCHEDULE", nullable = false)
    private String schedule;

    @Column(name = "TOPIC", nullable = false)
    private String topic;

    public Subject(Integer idSubject, List<com.example.school.repository.entity.Student> students, String teacher, String student, String schedule, String topic) {
        this.idSubject = idSubject;
        this.students = students;
        this.teacher = teacher;
        Student = student;
        this.schedule = schedule;
        this.topic = topic;
    }

    public Integer getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(Integer idSubject) {
        this.idSubject = idSubject;
    }

    public List<com.example.school.repository.entity.Student> getStudents() {
        return students;
    }

    public void setStudents(List<com.example.school.repository.entity.Student> students) {
        this.students = students;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getStudent() {
        return Student;
    }

    public void setStudent(String student) {
        Student = student;
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
