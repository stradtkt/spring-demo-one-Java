package com.stradtkt.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;

	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
 	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend 1 hour running out on track";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
