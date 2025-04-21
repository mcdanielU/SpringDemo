package com.chimevox.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Student is the name of the model class, ID type is long
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
