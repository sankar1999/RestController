package com.restcontroller.studentcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentcontroller {

    int intId;
    String strName;
    int intAge;
    String strCountry;
    String strReturn;

    @GetMapping("studentid/1")
    public String student1() {
        intId = 1;
        strName = "Justin";
        intAge = 28;
        strCountry = "Canada";
        strReturn = "Student ID: "+ intId +"\n" + "Student Name: " + strName +"\n"+ "Student Age: " + intAge + "\n"+"Student Country: " + strCountry;

        return strReturn;
    }

    @GetMapping("studentid/2")
    public String student2() {
        intId = 2;
        strName = "Zayn Malik";
        intAge = 30;
        strCountry = "UK";
        strReturn = "Student ID: "+ intId +"\n" + "Student Name: " + strName +"\n"+ "Student Age: " + intAge + "\n"+"Student Country: " + strCountry;

        return strReturn;
    }
}
