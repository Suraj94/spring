package com.luv2code.dependecyingestion;

/**
 * @author sbhosale
 *
 */
public class BoxCricketPracticeImpl implements ICoach {

	FortuneServices fortuneService;

	public String emailId;

	public String nameOfTeam;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		System.out.println("In Email Setter Method!");
		this.emailId = emailId;
	}

	public String getNameOfTeam() {
		return nameOfTeam;
	}

	public void setNameOfTeam(String nameOfTeam) {
		System.out.println("In nameOfTeam Setter Method!");
		this.nameOfTeam = nameOfTeam;
	}

	public BoxCricketPracticeImpl(FortuneServices theFortuneService) {
		System.out.println("In BoxCricketPracticeImpl Constructor!");
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyContextSummary() {
		return "Complete One 20 - 20 match";
	}

	@Override
	public String getTodaysFortune() {
		return fortuneService.getTodaysFortune();
	}

}
