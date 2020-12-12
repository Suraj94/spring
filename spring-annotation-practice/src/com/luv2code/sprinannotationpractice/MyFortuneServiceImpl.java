package com.luv2code.sprinannotationpractice;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyFortuneServiceImpl implements IFortuneService {

	public MyFortuneServiceImpl() {
		System.out.println(">> Inside of My Fortune Service Impl Constructor!");
	}

	@Value("${spring.fortunes}")
	private String fortunes;

	private String[] listOfFortunes;

	@Override
	public String getDailyfortune() {
		Random randomNo = new Random();
		// get the values of the fortune from properties file.
		int number = randomNo.nextInt(listOfFortunes.length);
		// get the randomm value of fortune.
		return listOfFortunes[number];
	}

	//init method
	@PostConstruct
	private void getArrayOffortune() {
		System.out.println(">>Inside of post constructor init method!");
		listOfFortunes = fortunes.split(",");
	}

	//destroy method
	@PreDestroy
	private void cleanUpMethod() {
		System.out.println(">> Inside of pre destroy method!");
	}

	public String getFortunes() {
		return fortunes;
	}

	public void setFortunes(String fortunes) {
		System.out.println(">>Inside fortunes set method!");
		this.fortunes = fortunes;
	}

}
