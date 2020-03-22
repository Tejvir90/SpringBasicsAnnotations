package com.tej.annotationspringdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:sports.properties")
public class SportsConfig {

    @Bean
    public Coach tableTennisCoach() {
        TableTennisCoach tableTennisCoach = new TableTennisCoach(sadFortuneService());
        return tableTennisCoach;
    }

    @Bean
    public FortuneService sadFortuneService() {
        SadFortuneService sadFortuneService = new SadFortuneService();
        return sadFortuneService;
    }
}
