package uk.warley.ganesh.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import uk.warley.ganesh.springdemo.beans.Coach;
import uk.warley.ganesh.springdemo.beans.FortuneService;
import uk.warley.ganesh.springdemo.beans.HappyFortuneService;
import uk.warley.ganesh.springdemo.beans.SwimCoach;

@Configuration
public class AppConfigWithBeanNWithoutComponentScan {

	@Bean //here we are exposing bean instead asking container to scan the beans from package
	public Coach getSwimCoach() {
		return new SwimCoach(getFortuneService());
	}
	public FortuneService getFortuneService() {
		FortuneService s=new  HappyFortuneService();
		System.out.println(s);
		return s;
	}

}
