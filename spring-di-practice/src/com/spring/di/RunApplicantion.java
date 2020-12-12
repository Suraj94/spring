package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunApplicantion
{
	public static void main(String[] args)
	{
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		ICoach coach = applicationContext.getBean(ICoach.class);
		coach.getTodaysWorkout();
		System.out.println(coach.getTodaysFortune());	
		System.out.println("========================================");
		IStudentInfo info =  applicationContext.getBean("student",IStudentInfo.class);
		System.out.println(info.getStudentClass());
		System.out.println(info.getStudentData());
	}
}
