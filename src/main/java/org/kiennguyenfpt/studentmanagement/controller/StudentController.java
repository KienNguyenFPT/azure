package org.kiennguyenfpt.studentmanagement.controller;

import org.kiennguyenfpt.studentmanagement.entity.Student;
import org.kiennguyenfpt.studentmanagement.service.StudentServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentServiceImpl studentService;

    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping()
    public String hello() {
        return "Hello World";
    }
}
