package com.chimevox.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class StudentConfig implements CommandLineRunner{

    private final StudentRepository studentRepository;

    @Autowired
    public StudentConfig(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if(studentRepository.count() == 0)
        {
            Student mariam = new Student( 1L,
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    21);
            Student uche = new Student( 1L,
                    "Uche Elekwa",
                    "dautch@gmail.com",
                    LocalDate.of(1997, Month.AUGUST, 7),
                    27);
            Student drake = new Student( 1L,
                    "Drizzy",
                    "drizzydrake@gmail.com",
                    LocalDate.of(1800, Month.OCTOBER, 10),
                    225);

            studentRepository.saveAll(List.of(mariam,uche, drake));
        }
    }
}
