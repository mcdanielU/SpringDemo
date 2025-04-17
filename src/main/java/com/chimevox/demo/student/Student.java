package com.chimevox.demo.student;


import java.time.LocalDate;

/**
 * Represents a student entity in the system.
 * This class encapsulates student information and provides business logic related to students.
 */
public class Student {
    private  Long id;
    
    private  String name;



    private String email;

    private LocalDate dob;
    
    private  Integer age;
    public Student(Long id, String name, String email, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
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
        return age;
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

