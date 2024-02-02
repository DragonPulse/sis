package com.dell.mentor.prg.sis.service.view;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private String name;
    private int age;
    private Address address;
    private String email;
    private String phone;
    private String studentId;
}
