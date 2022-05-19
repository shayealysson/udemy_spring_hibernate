package com.shayealysson.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*
	@Autowired
	public void doWireFortuneService(FortuneService service) {
		fortuneService = service;
	}*/
	
	/*
	@Autowired
	public void setFortuneService(FortuneService service) {
		this.fortuneService = service;
	}*/

	/*
	@Autowired
	public TennisCoach(FortuneService service) {
		fortuneService = service;
	}*/

	@Override
	public String getDailyWorkout() {
		return "TennisCoach: Run for 1 hour!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
