package com.luv2code.springdemo;

public class CricketCoach implements ICoach {
	
	public CricketCoach() {
		System.out.println("Inside Cricket Coach Contructor!");
	}
	
	@Override
	public String getDailyContextSummary() {
		return "Run Cricket Coach!!";
	}
}
