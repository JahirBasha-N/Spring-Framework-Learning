package com.zahir.JavaConfigFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung samsung = context.getBean(Samsung.class);
        System.out.println(samsung);
    }
}
