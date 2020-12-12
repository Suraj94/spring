package com.test.luv2code;

import org.springframework.beans.factory.annotation.Value;

public class SecondFortuneImpl implements IFortune
{
	@Value("spring.emailId")
	String username;

	@Value("spring.fortune")
	String userFortune;
	
	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getUserFortune()
	{
		return userFortune;
	}

	public void setUserFortune(String userFortune)
	{
		this.userFortune = userFortune;
	}

	@Override
	public String getTodaysFortune()
	{
		return "Second Fortune service is called!!";
	}
}
