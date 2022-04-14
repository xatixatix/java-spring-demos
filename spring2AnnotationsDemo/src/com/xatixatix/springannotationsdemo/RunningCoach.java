package com.xatixatix.springannotationsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RunningCoach implements Coach {

	@Autowired
	@Qualifier("randomService")
	private FortuneService fortuneService;
	
	@Value("${runningCoach.email}")
	private String email;
	    
	@Value("${runningCoach.team}")
	private String team;
	
	/*
	@Autowired
	public RunningCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Run for 30 minutes without stopping.";
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

}
