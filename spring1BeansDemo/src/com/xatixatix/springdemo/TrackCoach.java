package com.xatixatix.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	};
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}

	@Override
	public String getCoachEmailAddress() {
		return emailAddress;
	}

	@Override
	public String getCoachTeam() {
		return team;
	}
	
	public void trackCoachStartup() {
		System.out.println("Track coach is starting..");
	}

	public void trackCoachCleanup() {
		System.out.println("Track coach is stopping..");
	}
}
