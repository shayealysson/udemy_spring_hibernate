package com.shayealysson.springdemo;

public class BaseballCoach implements Coach{
	
	
	//define a private field for the dependency service
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService service) {
		fortuneService = service;
	}
	
	//default constructor
	public BaseballCoach() {}
	
	@Override
	public String getDailyWorkout() {
		return "BaseballCoach: Run for 30 minuites!";
	}

	@Override
	public String getDailyFortune() {
		// use fortuneService to get a fortune
		return fortuneService.getFortune();
	}
	
	
}
