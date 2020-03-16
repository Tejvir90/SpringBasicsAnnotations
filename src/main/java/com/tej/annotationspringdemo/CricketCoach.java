package com.tej.annotationspringdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    FortuneService fortuneService;

    @Autowired
    @Qualifier("happyFortuneServiceImpl")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Keep up batting " + fortuneService.generateFortuneForTheDay();
    }
}
