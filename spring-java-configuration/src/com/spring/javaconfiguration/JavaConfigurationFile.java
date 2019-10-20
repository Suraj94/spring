package com.spring.javaconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:spring-context.properties")
public class JavaConfigurationFile
{
	@Bean
	public IFortuneService happyFortuneService()
	{
		return new HappyfortuneService();
	}

	@Bean
	@Scope("prototype")
	public ICoach swimCoach()
	{
		return new SwimCoach(happyFortuneService());
	}
}
