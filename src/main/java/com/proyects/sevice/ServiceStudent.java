package com.proyects.sevice;

import java.util.List;

import com.proyects.model.Student;

public interface ServiceStudent {
    void saveStudent(Student student);

    Student findAStudents();

    List<Student> listAllStudents();

    void deleteStudent();
}
