package com.shayealysson.beanscopedemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shayealysson.springdemo.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach coachA = context.getBean("myCoachService", Coach.class);
		Coach coachB = context.getBean("myCoachService", Coach.class);
		
		// Check if they are the same bean
		boolean result = (coachA == coachB);
		System.out.println("\nSame object? " + result);
		System.out.println("\nMemory location coachA: " + coachA);
		System.out.println("\nMemory location coachB: " + coachB);
		
		
		// close context
		context.close();

	}

}
