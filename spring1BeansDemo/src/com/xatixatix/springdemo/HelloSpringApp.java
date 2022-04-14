package com.xatixatix.springdemo;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    static boolean isHockeyCoach = false;
    static ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
	
    public static void main(String[] args) {
		Coach coach = getCoach();
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		if (isHockeyCoach) {
			System.out.println(coach.getCoachEmailAddress());
			System.out.println(coach.getCoachTeam());
		}
		context.close();
	}

	static Coach getCoach() {
		
		Coach coachTemp = context.getBean(getSportType(), Coach.class);
		return coachTemp;
	}
	
	static String getSportType() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your sport:");
		String sport = scanner.nextLine();
		if (sport.equals("Hockey")) {
			isHockeyCoach = true;
		}
		scanner.close();
		return sport;
	}
}