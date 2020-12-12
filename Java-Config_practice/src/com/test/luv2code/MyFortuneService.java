package com.test.luv2code;

import org.springframework.beans.factory.annotation.Value;

public class MyFortuneService implements IFortune
{
	@Value("spring.emailId")
	String username;

	@Value("spring.fortune")
	String userFortune;

	@Override
	public String getTodaysFortune()
	{
		return userFortune + username;
	}

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
	
	
}
