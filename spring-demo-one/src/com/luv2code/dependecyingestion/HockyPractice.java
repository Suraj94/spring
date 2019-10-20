package com.luv2code.dependecyingestion;

public class HockyPractice implements ICoach {

	FortuneServices fortuneServices;

	public HockyPractice(FortuneServices theFortuneServices) {
		System.out.println("HockyPractice Constructor Called!");
		this.fortuneServices = theFortuneServices;
	}

	@Override
	public String getDailyContextSummary() {
		return "Hocky Summary: CompletedPractice!";
	}

	@Override
	public String getTodaysFortune() {
		return fortuneServices.getTodaysFortune();
	}

}
