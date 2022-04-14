package com.xatixatix.springannotationsdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	private String[] fortunes = {"This is your day!", 
								"You are lucky today!",
								"Today is your lucky day!"};
	@Override
	public String getFortune() {
		return fortunes[new Random().nextInt(fortunes.length)];
	}

}
