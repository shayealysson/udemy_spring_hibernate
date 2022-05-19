package com.shayealysson.springdemo;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService service) {
		fortuneService = service;
	}

	@Override
	public String getDailyWorkout() {
		return "SwimCoach: Pushup 100 times!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
