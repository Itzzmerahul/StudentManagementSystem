package com.example.demo.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class StudentController {

    @GetMapping("/")
    public String hello(){
        return "hello pig";
    }

    @GetMapping("/Student")
    public Student getapp(){
        return new Student(
                110,
                12,
                "Rahul",
                LocalDate.of(2004,2,2)
        );
    }
}
