package com.luv2code.sprinannotationpractice;

import java.util.jar.Attributes.Name;

import javax.annotation.processing.SupportedAnnotationTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FootBallCoachImpl implements ICoach {

	public FootBallCoachImpl() {
		System.out.println(">> Inside Of FootBall Coach Contrcutor!");
	}

	@Autowired
	@Qualifier("myFortuneServiceImpl")
	IFortuneService fortuneService;

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyfortune();
	}

}
