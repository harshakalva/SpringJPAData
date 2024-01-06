package com.springjpadata.repository;

import com.springjpadata.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByNameContaining(String name);
    List<Student> findByNameEquals(String name);
    List<Student> findByNameContainingAndAgeEqualsOrDepartmentEquals(String name, int age, String department) ;
}
