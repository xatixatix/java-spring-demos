package com.xatixatix.springannotationsdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	private String[] fortunes = {"This is your day!", 
			"You are lucky today!",
			"Today is your lucky day!"};
	
	@Override
	public String getFortune() {
		return "RandomService: " + fortunes[new Random().nextInt(fortunes.length)];
	}

}
