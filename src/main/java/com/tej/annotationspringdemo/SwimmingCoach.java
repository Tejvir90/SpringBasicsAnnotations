package com.tej.annotationspringdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach {

    @Autowired
    @Qualifier("fortuneServiceImpl")
    FortuneService fortuneService;


    @Override
    public String getDailyWorkout() {
        return "Work on your dolphin stroke" + "- " + fortuneService.generateFortuneForTheDay();
    }
}
