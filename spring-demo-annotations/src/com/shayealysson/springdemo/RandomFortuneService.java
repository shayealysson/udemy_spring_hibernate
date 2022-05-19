package com.shayealysson.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create array on strings
	private String[] data = {
			"Go biking",
			"Climb mountain",
			"Swim in the pool"
	};
	
	//create a random number generator
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		//pick random fortune from array
		int index = random.nextInt(data.length);	
		return data[index];
	}

}
