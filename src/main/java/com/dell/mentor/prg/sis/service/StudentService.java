package com.dell.mentor.prg.sis.service;

import com.dell.mentor.prg.sis.service.view.Address;
import com.dell.mentor.prg.sis.service.view.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public Student findStudent(){
        return new Student("Vijay", 25, buildAddress(), "", "", "123");
    }

    private Address buildAddress(){
        return Address.builder()
                .city("Seattle")
                .state("WA")
                .zip("98101")
                .country("USA")
                .build();
    }
}
