package com.shayealysson.springdemo;

public class CricketCoach implements Coach {
	//new fields
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	//define a private field for the dependency service
	private FortuneService fortuneService;
		
	//default constructor
	public CricketCoach() {}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "CricketCoach: Run for 5 minuites!";
	}
	
	
	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
