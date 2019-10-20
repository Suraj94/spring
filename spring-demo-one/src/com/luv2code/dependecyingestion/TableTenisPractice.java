package com.luv2code.dependecyingestion;

public class TableTenisPractice implements ICoach {
	
	FortuneServices fortuneService;

	@Override
	public String getDailyContextSummary() {
		return "Completed One Round Of TT!";
	}

	@Override
	public String getTodaysFortune() {
		return "Today you are Lucky!";
	}

	public void setFortuneService(FortuneServices fortuneService) {
		System.out.println("Inside Setter method of fortune service!");
		this.fortuneService = fortuneService;
	}

}
