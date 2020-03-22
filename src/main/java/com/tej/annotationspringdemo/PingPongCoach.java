package com.tej.annotationspringdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {


    FortuneService fortuneService;

    @Autowired
    PingPongCoach(@Qualifier("fortuneServiceImpl") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Dring Beer" + "- " + fortuneService.generateFortuneForTheDay();
    }
}
