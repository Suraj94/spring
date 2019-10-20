package com.luv2code.beanscopeAndlifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run
{
	public static void main(String[] args)
	{

		/*
		 * ClassPathXmlApplicationContext applicationContext = new
		 * ClassPathXmlApplicationContext( "bean-scope-applicationContext.xml");
		 */
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-lifecycle-applicationContext.xml");
		beanLifeCycleMethod(applicationContext);
		applicationContext.close();
	}
 
	
	private static void scopeOfBean(ClassPathXmlApplicationContext applicationContext)
	{
		ICoach coach = applicationContext.getBean("CricketCoach", ICoach.class);
		ICoach coach1 = applicationContext.getBean("CricketCoach", ICoach.class);
		boolean result = (coach == coach1) ? true : false;
		System.out.println("Result: " + result);
		System.out.println(coach);
		System.out.println(coach1);
	}

	private static void beanLifeCycleMethod(ClassPathXmlApplicationContext applicationContext)
	{
		ICoach coach = applicationContext.getBean("CricketCoach", ICoach.class);
	}
}
