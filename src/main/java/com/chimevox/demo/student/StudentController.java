package com.chimevox.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    private final StudentService studentService;


    public StudentController(StudentService studentService)
    {
    this.studentService = studentService;
    }
@GetMapping()
public List<Student> getStudents() {
return studentService.getStudents();
}
}
