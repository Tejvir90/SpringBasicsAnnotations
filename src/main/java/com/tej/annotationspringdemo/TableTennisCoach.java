package com.tej.annotationspringdemo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Setter
@Getter
public class TableTennisCoach implements Coach {

    FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;
    @Value("${foo.name}")
    private String team;

    public TableTennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "drink and enjoy for today" + fortuneService.generateFortuneForTheDay()
                + "\n" + email + "\n" + team;
    }


}
