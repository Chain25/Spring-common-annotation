package com.georgian.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // above classPathXmlApplicationContext is used for xml configuration but we have deleted it
        // as we are using java file for configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);

        College college = context.getBean("collegeBean",College.class);
        System.out.println("the college object is created by spring is "+college);
        college.test();
    }
}
