package com.example.school.repository;

import com.example.school.repository.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITeacherRepository extends JpaRepository<Teacher, Integer> {


}
