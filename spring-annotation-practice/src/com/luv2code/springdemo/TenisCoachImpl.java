package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TenisCoachImpl implements ICoach {

	@Override
	public String getDailyFortune() {
		return "Here is the fortune for tennis coach!!";
	}

}
