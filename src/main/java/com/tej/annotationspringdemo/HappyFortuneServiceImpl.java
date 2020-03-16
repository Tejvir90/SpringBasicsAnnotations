package com.tej.annotationspringdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneServiceImpl implements FortuneService {

    @Override
    public String generateFortuneForTheDay() {
        return "Its Your Lucky Day";
    }
}
