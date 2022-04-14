package com.xatixatix.springannotationsdemo;

import org.springframework.stereotype.Component;

@Component
public class RunningCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run for 30 minutes without stopping.";
	}

}
