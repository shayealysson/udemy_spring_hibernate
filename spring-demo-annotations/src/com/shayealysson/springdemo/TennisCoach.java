package com.shayealysson.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "TennisCoach: Run for 1 hour!";
	}

}
