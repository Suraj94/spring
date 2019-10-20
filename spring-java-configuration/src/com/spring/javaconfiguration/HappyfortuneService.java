package com.spring.javaconfiguration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;

public class HappyfortuneService implements IFortuneService
{
	@Override
	public String getDailyfortune()
	{
		return ">> Here is the happy fortune service!!";
	}

	@PostConstruct
	private void postConstuct()
	{
		System.out.println(">> Inside Post Constrict Method!!");
	}

	@PreDestroy
	private void preDestroyM()
	{
		System.out.println(">> Inside Pre Destroy Method!!");
	}
}
