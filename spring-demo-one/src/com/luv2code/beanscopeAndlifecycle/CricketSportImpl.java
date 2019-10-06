package com.luv2code.beanscopeAndlifecycle;

public class CricketSportImpl implements ICoach
{
	FortuneServices fortuneServices;

	public CricketSportImpl(FortuneServices theFortuneServices)
	{
		System.out.println("Inside CricketSportImpl Constructor!");
		this.fortuneServices = theFortuneServices;
	}

	@Override public String getDailyContextSummary()
	{
		return "In Cricket getDailyContextSummary! ";
	}

	@Override public String getTodaysFortune()
	{
		return fortuneServices.getTodaysFortune();
	}

	// Startup stuff!
	public void myInitMethod()
	{
		System.out.println("Inside Of Init Method!");
	}

	// End Stuff!
	public void myDestroyMthod()
	{
		System.out.println("Inside Of Destroy Method!");
	}
}
