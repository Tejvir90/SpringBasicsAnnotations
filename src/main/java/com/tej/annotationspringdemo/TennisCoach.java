package com.tej.annotationspringdemo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
@AllArgsConstructor
public class TennisCoach implements Coach {
    FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Its always my decision" + " - " + fortuneService.generateFortuneForTheDay();
    }
}
