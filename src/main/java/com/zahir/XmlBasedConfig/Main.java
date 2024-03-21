package com.zahir.XmlBasedConfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vehicle vehicle = (Vehicle) context.getBean("car");
        vehicle.drive();
        System.out.println(vehicle.getTyre());
        Vehicle bike = (Vehicle) context.getBean("bike");
        bike.drive();
        System.out.println(bike.getTyre());
    }
}