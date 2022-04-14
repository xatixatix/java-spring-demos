package com.xatixatix.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
	
	Coach theCoach = context.getBean("Track", Coach.class);
	Coach alphaCoach = context.getBean("Track", Coach.class);
	
	boolean result = (theCoach == alphaCoach);
	System.out.println("Are they equal? " + result);
	System.out.println("Memory location for theCoach: " + theCoach);
	System.out.println("Memory location for alphaCoach: " + alphaCoach);
	context.close();
	}
}
