package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class SwimCoach implements Coach{
    @Qualifier("sadFortuneService")
    private FortuneService fortuneService;

    public SwimCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim dude!";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
