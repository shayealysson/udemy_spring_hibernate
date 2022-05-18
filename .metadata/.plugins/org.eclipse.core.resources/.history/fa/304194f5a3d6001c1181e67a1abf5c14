package com.shayealysson.springdemo;

public class BaseballCoach implements Coach{
	
	
	//define a private field for the dependency service
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService service) {
		fortuneService = service;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run for 30 minuites!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
