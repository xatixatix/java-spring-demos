package com.xatixatix.springdemo;

public class HockeyCoach implements Coach{

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public HockeyCoach() {
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do the Hockey things.";
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
