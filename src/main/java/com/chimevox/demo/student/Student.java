package com.chimevox.demo.student;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

/**
 * Represents a student entity in the system.
 * This class encapsulates student information and provides business logic related to students.
 */

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "student_seq")
    @SequenceGenerator(name = "student_seq", sequenceName = "student_sequence", allocationSize = 1)
    private  Long id;

    private  String name;



    private String email;

    private LocalDate dob;

    @Transient
    private  Integer age;
    public Student(String name, String email, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;

    }

    public Student() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Private constructor to enforce the use of the builder pattern.
     */



    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Student{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", email='" + email + '\'' +
               ", dob=" + dob +
               ", age=" + age +
               '}';
    }

    /**
     * Builder class for creating Student instances.
     */



}

