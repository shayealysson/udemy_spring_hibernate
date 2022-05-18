package com.shayealysson.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Happy Day!";
	}

}
