package com.tej.annotationspringdemo;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
//@RequiredArgsConstructor
public class TennisCoach implements Coach {

//    @Qualifier("fortuneServiceImpl") @NonNull private final FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Its always my decision" + " - " /*+ fortuneService.generateFortuneForTheDay()*/;
    }
}
