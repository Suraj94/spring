package com.luv2code.dependecyingestion;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		readPropertyFromPropertiesFile(applicationContext);
	}

	private static void constructorDependencyIngestion(ClassPathXmlApplicationContext applicationContext) {
		ICoach coach = applicationContext.getBean("mySport", ICoach.class);

		System.out.println(coach.getDailyContextSummary());

		System.out.println("Fortune:" + coach.getTodaysFortune());
	}

	private static void setterMethodTypeDependecyIngestion(ClassPathXmlApplicationContext applicationContext) {
		ICoach coach = applicationContext.getBean("TTSport", ICoach.class);

		System.out.println(coach.getDailyContextSummary());

		System.out.println("Fortune: " + coach.getTodaysFortune());
	}

	private static void hardcodedPropertyValueInConfig(ClassPathXmlApplicationContext applicationContext) {

		BoxCricketPracticeImpl coach = applicationContext.getBean("BoxCricket", BoxCricketPracticeImpl.class);
		System.out.println(coach.getDailyContextSummary());
		System.out.println(coach.getTodaysFortune());
		System.out.println(coach.getEmailId());
		System.out.println(coach.getNameOfTeam());
	}

	private static void readPropertyFromPropertiesFile(ClassPathXmlApplicationContext applicationContext) {

		BoxCricketPracticeImpl coach = applicationContext.getBean("BoxCricket", BoxCricketPracticeImpl.class);
		System.out.println(coach.getDailyContextSummary());
		System.out.println(coach.getTodaysFortune());
		System.out.println(coach.getEmailId());
		System.out.println(coach.getNameOfTeam());

	}

}
