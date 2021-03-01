package com.georgian.college;

import org.springframework.stereotype.Component;

@Component("collegeBean")  // same as bean tag in beans.xml file create an oject for an single class
public class College {
    public void test(){
        System.out.println("test method is created");
    }
}
