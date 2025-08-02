package com.proyects.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "professors")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 20)
    @NotBlank
    @Size(min = 3, max = 20, message = "The name must be between 3 and 20 characters long")
    private String name;
    @Size(min = 2, max = 20, message = "The last name must be between 2 and 20 characters long")
    @Column(nullable=false,length=20)
    @NotBlank
    private String lastName;
    @NotBlank
    @Size(min = 2, max = 20, message = "The speciality must be between 2 and 20 characters long")
    @Column(nullable = false, length = 20)
    private String speciality;
    @Column(nullable = false, length = 20)
    @NotBlank
    @Email
    private String email;
    @OneToMany(mappedBy = "professor")
    private List<Course> courses;
}
