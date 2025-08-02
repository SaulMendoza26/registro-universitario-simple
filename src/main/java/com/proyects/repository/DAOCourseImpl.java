package com.proyects.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.proyects.model.Course;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jakarta.persistence.PersistenceContext;
@Repository
public class DAOCourseImpl implements  DAOCourse{

    
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    @Transactional
    public void saveCourse(Course course) {
       entityManager.persist(course);
    }

    @Override
    public Course findACourses() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findACourses'");
    }

    @Override
    public List<Course> listAllCourse() {
       String jpql = "SELECT c FROM Course c";
       return entityManager.createQuery(jpql, Course.class).getResultList();
    }

    @Override
    public void deleteCourse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCourse'");
    }
    
}
