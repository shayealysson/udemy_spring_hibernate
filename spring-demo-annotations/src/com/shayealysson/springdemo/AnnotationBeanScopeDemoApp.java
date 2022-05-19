package com.shayealysson.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring config
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach coachA = context.getBean("tennisCoach", Coach.class);
		Coach coachB = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (coachA == coachB);
		System.out.println("Same Object? " + result);
		System.out.println("Memory coachA: " + coachA);
		System.out.println("Memory coachB: " + coachB);
		
		//use bean method
		
		//close context
		context.close();

	}

}
