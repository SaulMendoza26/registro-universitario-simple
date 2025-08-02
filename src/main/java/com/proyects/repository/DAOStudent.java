package com.proyects.repository;

import java.util.List;

import com.proyects.model.Course;
import com.proyects.model.Student;

public interface DAOStudent{

    void saveStudent(Student student);

    Course findAStudents();

    List<Student> listAllStudents();

    void deleteStudent();
}
