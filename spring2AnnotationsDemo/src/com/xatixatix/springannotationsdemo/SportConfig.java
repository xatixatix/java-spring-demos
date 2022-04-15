package com.xatixatix.springannotationsdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.xatixatix.springannotationsdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

	@Bean
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean
	public Coach tennisCoach() {
		return new TennisCoach(happyFortuneService());
	}
}
