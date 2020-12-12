package com.test.luv2code;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.test.luv2code")
@PropertySource("classpath:spring-context.properties")
public class JavaConfiguration
{
	@Bean /*(initMethod = "initMethod", destroyMethod = "destroyMethod")*/
	public ICoach getCoachImplimentation()
	{
		return new TennisCoachImpl();
	}

	@Bean	
	public IFortune getFortuneImpl()
	{
		return new MyFortuneService();
	}

	@Bean
	@Primary
	public IFortune getSecondFortuneImpl()
	{
		return new SecondFortuneImpl();
	}
	
	@Bean
	public IMansoonDetail getTodaysMansoon() {
		return new TodaysMansoonDetail();
	}
}
