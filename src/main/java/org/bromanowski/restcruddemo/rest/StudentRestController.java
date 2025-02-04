package org.bromanowski.restcruddemo.rest;

import org.bromanowski.restcruddemo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents() {

        //hard coded for now
        List<Student> students = new ArrayList<>();
        students.add(new Student("Adam", "Adams"));
        students.add(new Student("Bob", "Bobbie"));
        students.add(new Student("Charles", "Charleston"));

        return  students;
    }
}
