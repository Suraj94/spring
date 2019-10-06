package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {		
		// Create Object
		ICoach theCoach = new CricketCoach();
		// Pring Object implementation
		System.out.println(theCoach.getDailyContextSummary());
	}

}
