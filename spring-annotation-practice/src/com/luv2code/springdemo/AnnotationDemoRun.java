package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoRun {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		initializeBeanByDefaultName(applicationContext);
	}

	public static void getBeanById(ClassPathXmlApplicationContext applicationContext) {
		ICoach coach = applicationContext.getBean("boxCrckBean", ICoach.class);
		System.out.println(coach.getDailyFortune());
		applicationContext.close();
	}

	public static void initializeBeanByDefaultName(ClassPathXmlApplicationContext applicationContext) {
		ICoach coach = applicationContext.getBean("tenisCoachImpl", ICoach.class);
		System.out.println(coach.getDailyFortune());
		applicationContext.close();
	}

}
