package uk.warley.ganesh.springdemo;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import uk.warley.ganesh.springdemo.beans.Coach;
import uk.warley.ganesh.springdemo.beans.SwimCoach;
import uk.warley.ganesh.springdemo.config.AppConfigWithBeanNWithoutComponentScan;

public class AppDemoWithoutComponentScan {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				AppConfigWithBeanNWithoutComponentScan.class)) {
			Coach coach = annotationConfigApplicationContext.getBean("getSwimCoach", SwimCoach.class);
			System.out.println(coach.getDailyWorkout());
			System.out.println(coach.getDailyFortuneService());
			coach = annotationConfigApplicationContext.getBean("getSwimCoach", SwimCoach.class);
			System.out.println(coach.getDailyWorkout());
			System.out.println(coach.getDailyFortuneService());
		} catch (BeansException e) {
			e.printStackTrace();
		}

	}
}
