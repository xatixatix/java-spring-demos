package com.xatixatix.springannotationsdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach tennisCoach1 = context.getBean("tennisCoach", Coach.class);
		Coach tennisCoach2 = context.getBean("tennisCoach", Coach.class);
	
		boolean result = (tennisCoach1 == tennisCoach2);
		System.out.println("Memory location: " + tennisCoach1);
		System.out.println("Memory location: " + tennisCoach2);
		System.out.println("Are they in the same location?: " + result);
		
		context.close();
	}

}
