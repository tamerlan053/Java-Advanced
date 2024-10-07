package ru.kors.springstudents.service;

import ru.kors.springstudents.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudents();
}
