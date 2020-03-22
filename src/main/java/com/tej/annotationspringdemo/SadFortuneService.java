package com.tej.annotationspringdemo;

public class SadFortuneService implements FortuneService {
    @Override
    public String generateFortuneForTheDay() {
        return "power  on through";
    }
}
