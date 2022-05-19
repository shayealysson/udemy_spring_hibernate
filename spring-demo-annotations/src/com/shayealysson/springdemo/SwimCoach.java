package com.shayealysson.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${my.email}")
	private String email;
	
	@Value("${my.team}")
	private String team;
	
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

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	

}
