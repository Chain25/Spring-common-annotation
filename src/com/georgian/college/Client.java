package com.georgian.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("bean.xml file is created or object is created");
        College college = context.getBean("collegeBean",College.class);
        System.out.println("the college object is created by spring is "+college);
    }
}
