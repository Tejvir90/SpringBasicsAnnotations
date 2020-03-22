package com.tej.annotationspringdemo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@Component
public class VolleyBallCoach implements Coach {


    @Autowired
    @Qualifier("fortuneServiceImpl")
    FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "HelloWorld" + " - " + fortuneService.generateFortuneForTheDay();
    }
}
