package com.test.luv2code;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApp
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		ICoach coach = applicationContext.getBean("getCoachImplimentation", ICoach.class);
		coach.getTodaysWorkout();
		System.out.println(coach.getTodaysFortune());
		coach.getTodaysMansoon();
	}
}
