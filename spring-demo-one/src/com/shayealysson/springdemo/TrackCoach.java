package com.shayealysson.springdemo;

public class TrackCoach implements Coach {
	
	//define a private field for the dependency service
	private FortuneService fortuneService;
		
	//define a constructor for dependency injection
	public TrackCoach(FortuneService service) {
		fortuneService = service;
	}
	
	//default constructor
	public TrackCoach() {}

	@Override
	public String getDailyWorkout() {
		return "Run for two hours!";
	}

	@Override
	public String getDailyFortune() {
		// use fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
