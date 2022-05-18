package com.shayealysson.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the spring config file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean\
		CricketCoach coach =  context.getBean("myCricketCoach", CricketCoach.class);
		
		//call bean methods
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		//close context
		context.close();

	}

}
