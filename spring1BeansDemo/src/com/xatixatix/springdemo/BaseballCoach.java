package com.xatixatix.springdemo;

public class BaseballCoach implements Coach{

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	};
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	@Override
	public String getCoachEmailAddress() {
		return emailAddress;
	}
	@Override
	public String getCoachTeam() {
		return team;
	}
}