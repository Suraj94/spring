package com.spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:applicationContext.xml")
public class ApplicationConfiguration
{
	@Bean
	public ICoach getCoachBean()
	{
		return new TennisCoachImpl();
	}

	@Bean
	public IFortune getFortuneBean()
	{
		return new MyFortuneService();
	}
}
