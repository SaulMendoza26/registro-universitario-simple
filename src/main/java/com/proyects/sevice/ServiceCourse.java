package com.proyects.sevice;

import java.util.List;

import com.proyects.model.Course;

public interface ServiceCourse {
    void saveCourse(Course course);

    Course findACourses();

    List<Course> listAllCourse();

    void deleteCourse();
}
