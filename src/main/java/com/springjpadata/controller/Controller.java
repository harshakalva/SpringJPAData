package com.springjpadata.controller;

import com.springjpadata.entity.Course;
import com.springjpadata.entity.Student;
import com.springjpadata.repository.CourseRepository;
import com.springjpadata.repository.StudentRepository;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "/student")
public class Controller {
    @Resource
    StudentRepository studentRepository;
    @Resource
    CourseRepository courseRepository;

    @GetMapping
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
    @PostMapping
    public Student saveStudentWithCourse(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping(path="/{id}")
    public Optional<Student> findStudent(@PathVariable Long id) {
        return studentRepository.findById(id);
    }

    @GetMapping(path = "find/{name}")
    public List<Student> findStudentsByName(String name) {
        return studentRepository.findByNameContaining(name);
    }

    @GetMapping("/course-price")
    public List<Course> findCourseLessThenPriceDouble(@PathVariable double price ) {
        return courseRepository.findByFeeLessThan(price);
    }

    @GetMapping("/{name}/{age}/{department}")
    public List<Student> findStudents(@PathVariable  String name, @PathVariable  int age, @PathVariable  String department) {
        return studentRepository.findByNameContainingAndAgeEqualsOrDepartmentEquals(name, age, department);
    }
}
