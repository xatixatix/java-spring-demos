package com.xatixatix.springannotationsdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired //java reflection, field injection
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	@Value("${tennisCoach.email}")
	private String email;
	    
	@Value("${tennisCoach.team}")
	private String team;
	
	public TennisCoach() {}

	/*
	@Autowired //constructor injection
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	/*
	@Autowired //setter injection
	public void setFortuneService(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley for 20 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public String getTeam() {
		return team;
	}

	@PostConstruct
	private void initWork() {
		System.out.println("PostConstruct function.");
	}
	
	@PreDestroy //it's not called for prototype beans actually..
	private void destroyWork() {
		System.out.println("PreDestroy function.");
	}
}
