package com.proyects.controller;

import java.util.List;

import javax.naming.Binding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyects.model.Course;
import com.proyects.model.Student;
import com.proyects.sevice.ServiceCourse;
import com.proyects.sevice.ServiceStudent;

import jakarta.validation.Valid;

@Controller
public class ControllerMain {
    @Autowired
    private ServiceCourse serviceCourse;
    @Autowired
    private ServiceStudent serviceStudent;
    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping("/registerStudent")
    public String registerStudent(Model model) {
        model.addAttribute("student", new Student());
        List<Course> courses = serviceCourse.listAllCourse();
        model.addAttribute("allCourses", courses);
        return "registerStudent";
    }

    @RequestMapping("/registerCourse")
    public String registerProfessor(Model model) {
        model.addAttribute("course", new Course());
        return "registerCourse";
    }

    @RequestMapping("/saveCourse")
    public String saveCourse(@Valid @ModelAttribute("course") Course course,BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {

            return "registerCourse";
        }
        try {
            serviceCourse.saveCourse(course);
        } catch (IllegalArgumentException e) {
            model.addAttribute("messageError", e.getMessage());
            return "registerCourse";
        }
        return "saveCourse";
    }

    @RequestMapping("/saveStudent")
    public String saveStudent(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()){
            return "registerStudent";
        }
        try {
            serviceStudent.saveStudent(student);
        } catch (IllegalArgumentException e) {
            model.addAttribute("messagesErrors",e.getMessage());
            return "registerStudent";
        }
        return "saveStudent";
    }

}
