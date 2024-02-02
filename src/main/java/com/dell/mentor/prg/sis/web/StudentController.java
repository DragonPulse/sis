package com.dell.mentor.prg.sis.web;

import com.dell.mentor.prg.sis.service.view.Student;
import com.dell.mentor.prg.sis.service.view.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class StudentController {

    @Autowired
    StudentService service;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World.... Vijay";
    }

    @RequestMapping("/students")
    public Student getStudents() {
        return service.findStudent();
    }
}
