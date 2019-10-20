package com.luv2code.beanscopeAndlifecycle;

public class BoxCricketFortuneImpl implements FortuneServices {

	@Override
	public String getTodaysFortune() {
		return "You will get win this match!";
	}

	public String getTommorowFortune() {
		return "You will able to do 100 runs!";
	}

}
