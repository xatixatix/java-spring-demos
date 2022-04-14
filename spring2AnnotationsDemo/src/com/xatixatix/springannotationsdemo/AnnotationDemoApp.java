package com.xatixatix.springannotationsdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach runningCoach = context.getBean("runningCoach", Coach.class);
		
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(runningCoach.getDailyWorkout());
		context.close();
	}

}
