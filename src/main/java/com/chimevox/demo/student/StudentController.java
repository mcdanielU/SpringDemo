package com.chimevox.demo.student;

import org.springframework.web.bind.annotation.*;

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

@PostMapping
    public void registerStudents(@RequestBody Student student){
        studentService.addNewStudent(student);
    }
}
