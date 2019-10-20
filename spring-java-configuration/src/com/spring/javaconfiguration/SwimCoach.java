package com.spring.javaconfiguration;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements ICoach
{
	IFortuneService fortuneService;

	@Value("${teamName}")
	String teamName;

	@Value("${teamOfficialId}")
	String teamOfficialId;

	public SwimCoach(IFortuneService theFortuneService)
	{
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyFortune()
	{
		return fortuneService.getDailyfortune();
	}

	public String getTeamName()
	{
		return teamName;
	}

	public String getTeamOfficialId()
	{
		return teamOfficialId;
	}
}
