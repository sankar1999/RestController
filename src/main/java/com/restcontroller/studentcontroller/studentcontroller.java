package com.restcontroller.studentcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentcontroller {

    @GetMapping("1")
    public String student1() {
        return "Student 1";
    }
}
