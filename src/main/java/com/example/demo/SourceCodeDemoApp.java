package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SourceCodeDemoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        Coach theCoach = context.getBean("swimCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());
        context.close();
    }

}
