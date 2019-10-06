package com.luv2code.sprinannotationpractice;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyFortuneServiceImpl implements IFortuneService {

	public MyFortuneServiceImpl() {
		System.out.println(">> Inside of My Fortune Service Impl Constructor!");
	}

	@Value("${spring.fortunes}")
	private String fortunes;

	@Override
	public String getDailyfortune() {
		Random randomNo = new Random();
		// get the values of the fortune from properties file.
		int number = randomNo.nextInt(getArrayOffortune().length);
		// get the randomm value of fortune.
		return getArrayOffortune()[number];
	}

	private String[] getArrayOffortune() {
		return fortunes.split(",");
	}

	public String getFortunes() {
		return fortunes;
	}

	public void setFortunes(String fortunes) {
		System.out.println(">>Inside fortunes set method!");
		this.fortunes = fortunes;
	}

}
