package com.spring.di;

import java.util.Map;

public class SecondaryStudent implements IStudentInfo
{
	Map<String, String> mpaOfData;
	
	public SecondaryStudent()
	{
	}
	
	@Override
	public String getStudentClass()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getStudentData()
	{		
		return this.mpaOfData.toString();
	}

	public Map<String, String> getMpaOfData()
	{
		return mpaOfData;
	}

	public void setMpaOfData(Map<String, String> mpaOfData)
	{
		this.mpaOfData = mpaOfData;
	}
	
	
	
}
