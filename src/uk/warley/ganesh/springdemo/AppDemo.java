package uk.warley.ganesh.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import uk.warley.ganesh.springdemo.beans.Coach;
import uk.warley.ganesh.springdemo.config.AppConfig;

public class AppDemo {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				AppConfig.class)) { // we dont have to have another class AppConfig.class, we can make this class as
									// Configuration class
			Coach coach = applicationContext.getBean("cricketCoach", Coach.class);
			System.out.println(coach.getDailyWorkout());
		}

	}

}
