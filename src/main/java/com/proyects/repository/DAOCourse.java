package com.proyects.repository;

import java.util.List;

import com.proyects.model.Course;

public interface DAOCourse {

    void saveCourse(Course course);

    Course findACourses();

    List<Course> listAllCourse();

    void deleteCourse();
}
