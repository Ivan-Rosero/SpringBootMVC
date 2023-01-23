package com.example.school.repository.entity;

import com.example.school.dto.SubjectDTO;
import java.util.ArrayList;
import javax.persistence.*;
import java.util.List;

@Entity
public class Subject {

    @Id
    @Column(name = "SUBJECT_ID", unique = true)
    private Integer idSubject;
    
    @OneToMany(mappedBy = "SUBJECT", cascade = CascadeType.ALL)
    private List<Student> students = new ArrayList<>();

    @Column(name = "SUBJECTNAME", nullable = false)
    private String subjectName;
            
    @Column(name = "SCHEDULE", nullable = false)
    private String schedule;

    @Column(name = "TOPIC", nullable = true)
    private String topic;
    
    @JoinColumn(name = "TEACHER_ID")
    private Teacher teacher;

    public Subject() {
    }

    public Subject(Integer idSubject, String subjectName, String schedule, String topic, Teacher teacher) {
        this.idSubject = idSubject;
        this.subjectName = subjectName;
        this.schedule = schedule;
        this.topic = topic;
        this.teacher = teacher;
    }

    public Subject(Integer idSubject, String subjectName) {
        this.idSubject = idSubject;
        this.subjectName = subjectName;
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

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    public Subject(SubjectDTO subjectDTO){
        this.subjectName = subjectDTO.getSubjectName();
        this.schedule = subjectDTO.getSchedule();
        if(subjectDTO.getTopic()!=null){
            this.topic = subjectDTO.getTopic();
        }
    } 
}
