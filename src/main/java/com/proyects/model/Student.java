package com.proyects.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Column(nullable = false, length = 20)
    @Size(min = 3, max = 20, message = "The name must be between 3 and 20 characters long")
    private String name;
    @Column(nullable = false, length = 20)
    @Size(min = 2, max = 20, message = "The last name must be between 2 and 20 characters long")
    @NotBlank
    private String lastName;
    @Column(nullable = false, length = 20)
    @Email
    @NotBlank    
    private String email;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
