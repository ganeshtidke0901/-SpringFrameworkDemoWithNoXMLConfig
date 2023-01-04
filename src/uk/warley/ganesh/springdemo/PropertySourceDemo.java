package uk.warley.ganesh.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import uk.warley.ganesh.springdemo.beans.KabaddiCoach;
import uk.warley.ganesh.springdemo.config.AppConfig;

public class PropertySourceDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				AppConfig.class);

		KabaddiCoach coach = annotationConfigApplicationContext.getBean("kabaddiCoach", KabaddiCoach.class);
		System.out.println(coach.getDetails());
	}

}
