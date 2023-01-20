package com.example.school.repository;

import com.example.school.repository.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISubjectRepository extends JpaRepository<Subject, Integer> {
}
