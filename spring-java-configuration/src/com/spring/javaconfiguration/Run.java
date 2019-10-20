package com.spring.javaconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(JavaConfigurationFile.class);
		javaConfigScope(annotationConfigApplicationContext);
		annotationConfigApplicationContext.close();
	}

	private static void javaConfiguration1(AnnotationConfigApplicationContext annotationConfigApplicationContext)
	{
		ICoach coach = annotationConfigApplicationContext.getBean("swimCoach", ICoach.class);
		System.out.println(coach.getDailyFortune());
	}

	private static void javaConfigurationWithAllAnno(AnnotationConfigApplicationContext annotationConfigApplicationContext)
	{
		SwimCoach coach = annotationConfigApplicationContext.getBean("swimCoach", SwimCoach.class);
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getTeamName());
		System.out.println(coach.getTeamOfficialId());
	}

	private static void javaConfigScope(AnnotationConfigApplicationContext annotationConfigApplicationContext)
	{
		ICoach coach = annotationConfigApplicationContext.getBean("swimCoach", ICoach.class);
		ICoach coach2 = annotationConfigApplicationContext.getBean("swimCoach", ICoach.class);
		if (coach != coach2)
			System.out.println("Both Coach object are not same");
		System.out.println(coach);
		System.out.println(coach2);
	}
}
