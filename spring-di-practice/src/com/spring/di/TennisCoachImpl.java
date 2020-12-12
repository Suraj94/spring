package com.spring.di;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TennisCoachImpl implements ICoach
{
	@Autowired
	IFortune fortune;	

	public TennisCoachImpl()
	{
	}

	public TennisCoachImpl(IFortune fortune)
	{
		this.fortune = fortune;
	}

	@PostConstruct
	public void initMethod()
	{
		System.out.println("Init Method of --> Tennis Coach");
	}

	@PreDestroy
	public void destroyMethod()
	{
		System.out.println("Destry Method of --> Tennis Coach");
	}

	@Override
	public void getTodaysWorkout()
	{
		System.out.println("Today is 2 hrs Workout !");
	}

	@Override
	public String getTodaysFortune()
	{
		return this.fortune.getTodaysFortune();
	}
}
