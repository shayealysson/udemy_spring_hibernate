package com.shayealysson.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	@Autowired
	public TennisCoach(FortuneService service) {
		fortuneService = service;
	}

	@Override
	public String getDailyWorkout() {
		return "TennisCoach: Run for 1 hour!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
