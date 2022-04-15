package com.xatixatix.springannotationsdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo_noxml {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);

		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach runningCoach = context.getBean("runningCoach", Coach.class);
		
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println(tennisCoach.getEmail());
		System.out.println(tennisCoach.getTeam());
		System.out.println(runningCoach.getDailyWorkout());
		System.out.println(runningCoach.getDailyFortune());
		System.out.println(runningCoach.getEmail());
		System.out.println(runningCoach.getTeam());
		context.close();
	}

}
