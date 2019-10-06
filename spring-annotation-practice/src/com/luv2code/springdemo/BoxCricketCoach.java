package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("boxCrckBean")
public class BoxCricketCoach implements ICoach {

	@Override
	public String getDailyFortune() {
		return "Here is your todays fortune";
	}

}
