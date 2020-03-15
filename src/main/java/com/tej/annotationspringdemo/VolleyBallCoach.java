package com.tej.annotationspringdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
@AllArgsConstructor
public class VolleyBallCoach implements Coach {

    FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "HelloWorld" + " - " + fortuneService.generateFortuneForTheDay();
    }
}
