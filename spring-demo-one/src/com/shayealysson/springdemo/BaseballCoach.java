package com.shayealysson.springdemo;

public class BaseballCoach implements Coach{
	
	@Override
	public String getDailyWorkout() {
		return "Run for 30 minuites!";
	}
}
