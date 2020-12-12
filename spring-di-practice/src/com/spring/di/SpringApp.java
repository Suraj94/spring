package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp
{
	
	private final static String CLASS_CONSTANT = "suraj";
	
	public static void main(String[] args) throws Exception
	{
		/*ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentInfo info =  applicationContext.getBean("student", IStudentInfo.class);
		System.out.println(info.getStudentClass() +"\n");
		throw new Exception("caught error !!");*/
		engineeringStd();
	}

	private static void engineeringStd()
	{
		String value = "";
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
		IStudentInfo info =  applicationContext.getBean("student", IStudentInfo.class);
		System.out.println(info.getStudentClass());
		System.out.println(info.getStudentData());
		
	}
	
	
}
