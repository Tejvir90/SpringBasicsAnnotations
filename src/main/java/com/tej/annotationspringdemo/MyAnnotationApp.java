package com.tej.annotationspringdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyAnnotationApp {

    public static void main(String args[]) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("annotationApplicationContext.xml");

        Coach volleyBallCoach = classPathXmlApplicationContext.getBean("volleyBallCoach", Coach.class);
        Coach tennisCoach = classPathXmlApplicationContext.getBean("thatSillyCoach", Coach.class);
        Coach pingPongCoach = classPathXmlApplicationContext.getBean("pingPongCoach", Coach.class);
        Coach cricketCoach = classPathXmlApplicationContext.getBean("cricketCoach", Coach.class);
        Coach swimmingCoach = classPathXmlApplicationContext.getBean("swimmingCoach", Coach.class);
        System.out.println(volleyBallCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(pingPongCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(swimmingCoach.getDailyWorkout());
        classPathXmlApplicationContext.close();
    }
}
