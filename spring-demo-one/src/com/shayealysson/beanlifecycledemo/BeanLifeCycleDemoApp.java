package com.shayealysson.beanlifecycledemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shayealysson.springdemo.Coach;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach coach = context.getBean("myCoachService", Coach.class);
		
		// Check if they are the same bean
		System.out.println(coach.getDailyWorkout());
		
		
		// close context
		context.close();

	}

}
