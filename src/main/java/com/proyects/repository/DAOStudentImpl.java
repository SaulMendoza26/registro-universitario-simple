package com.proyects.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.proyects.model.Course;
import com.proyects.model.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class DAOStudentImpl implements DAOStudent {
    @PersistenceContext
    private EntityManager entityManager;
	@Override
    @Transactional
	public void saveStudent(Student student) {
        entityManager.persist(student);
	}

	@Override
	public Course findAStudents() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'findAStudents'");
	}

	@Override
	public List<Student> listAllStudents() {
		String jspql ="select s from Student s";
        return entityManager.createQuery(jspql, Student.class).getResultList();
	}

	@Override
	public void deleteStudent() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'deleteStudent'");
	}
    
}
