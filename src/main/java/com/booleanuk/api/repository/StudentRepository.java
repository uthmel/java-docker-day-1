package com.booleanuk.api.repository;

import com.booleanuk.api.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}

