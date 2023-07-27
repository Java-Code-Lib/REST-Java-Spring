package com.stradtkt.restapi.rest;

import com.stradtkt.restapi.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> students;

    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();
        students.add(new Student("Kevin", "Smith"));
        students.add(new Student("Kyle", "Setters"));
        students.add(new Student("Patrick", "Jones"));
        students.add(new Student("Lee", "Petterson"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        if((studentId >= students.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student id was not in the system please try again!");
        }
        return students.get(studentId);
    }
}
