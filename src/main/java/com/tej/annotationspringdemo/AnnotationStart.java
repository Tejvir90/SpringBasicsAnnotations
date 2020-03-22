package com.tej.annotationspringdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationStart {


    public static void main(String args[]) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(SportsConfig.class);

        Coach cricketCoach = annotationConfigApplicationContext.getBean("cricketCoach", Coach.class);

        System.out.println(cricketCoach.getDailyWorkout());

        Coach tableTennisCoach= annotationConfigApplicationContext.getBean("tableTennisCoach", Coach.class);
        System.out.println(tableTennisCoach.getDailyWorkout());

    }

}
