package com.shayealysson.springdemo;

public class TrackCoach implements Coach {
	
	//define a private field for the dependency service
	private FortuneService fortuneService;
		
	//define a constructor for dependency injection
	public TrackCoach(FortuneService service) {
		System.out.println("-TrackCoach Constructor with param-");
		fortuneService = service;
	}
	
	//default constructor
	public TrackCoach() {
		System.out.println("-TrackCoach Constructor NO param-");
	}

	@Override
	public String getDailyWorkout() {
		return "TrackCoach: Run for two hours!";
	}

	@Override
	public String getDailyFortune() {
		// use fortuneService to get a fortune
		return fortuneService.getFortune();
	}
	
	//add init method
	public void onStartUp() {
		System.out.println("-START-");
	}
	
	//add destroy method
	public void onShutDown() {
		System.out.println("-END-");
	}

}
