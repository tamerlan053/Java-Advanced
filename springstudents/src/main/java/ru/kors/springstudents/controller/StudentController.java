package ru.kors.springstudents.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kors.springstudents.model.Student;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> findAllStudent() {
        return List.of(
                Student.builder().firstName("John").email("john19@gmail.com").age(37).build(),
                Student.builder().firstName("Jessa").email("jessa57@gmail.com").age(53).build(),
                Student.builder().firstName("Marco").email("marco101@gmail.com").age(21).build()
        );
    }
}