package com.stradtkt.springdemo;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes in the batting cages";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
