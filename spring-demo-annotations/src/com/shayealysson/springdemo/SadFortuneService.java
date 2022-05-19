package com.shayealysson.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "SadFortuneService: Sad Day :(";
	}

}
