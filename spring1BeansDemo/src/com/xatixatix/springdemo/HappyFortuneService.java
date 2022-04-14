package com.xatixatix.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private String[] fortunes = {"This is your day!", 
								"You are lucky today!",
								"Today is your lucky day!"};
	@Override
	public String getFortune() {
		return fortunes[new Random().nextInt(fortunes.length)];
	}

}
