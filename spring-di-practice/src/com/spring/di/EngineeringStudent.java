package com.spring.di;

public class EngineeringStudent implements IStudentInfo {

	String name;
	int age;
	String className;
	
	Marksheet marksheet; 

	public Marksheet getMarksheet()
	{
		return marksheet;
	}

	public void setMarksheet(Marksheet marksheet)
	{
		this.marksheet = marksheet;
	}

	public EngineeringStudent() {
	}
	
	@Override
	public String getStudentData()
	{		
		// TODO Auto-generated method stub
		return null;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getClassName()
	{
		return className;
	}

	public void setClassName(String className)
	{
		this.className = className;
	}

	@Override
	public String getStudentClass() {
		return this.className;
	}

}
