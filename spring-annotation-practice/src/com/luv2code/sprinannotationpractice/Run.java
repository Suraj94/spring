package com.luv2code.sprinannotationpractice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		ICoach coach = applicationContext.getBean("footBallCoachImpl", ICoach.class);
		System.out.println(coach.getDailyFortune());
		applicationContext.close();
	}

}
