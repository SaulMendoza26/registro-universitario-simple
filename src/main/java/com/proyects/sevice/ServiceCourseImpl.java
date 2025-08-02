package com.proyects.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyects.model.Course;
import com.proyects.repository.DAOCourse;

@Service
public class ServiceCourseImpl implements ServiceCourse {
    @Autowired
    private DAOCourse daoCourse;

    @Override
    public void saveCourse(Course course) {

        daoCourse.saveCourse(course);
    }

    @Override
    public Course findACourses() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findACourses'");
    }

    @Override
    public List<Course> listAllCourse() {
        return daoCourse.listAllCourse();

    }

    @Override
    public void deleteCourse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCourse'");
    }

}
