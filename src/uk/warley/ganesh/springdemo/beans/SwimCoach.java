package uk.warley.ganesh.springdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "This is Tennis workout";
	}

	@Override
	public String getDailyFortuneService() {
		return fortuneService.getFortuneService();
	}

}
