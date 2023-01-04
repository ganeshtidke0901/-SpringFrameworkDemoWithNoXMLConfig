package uk.warley.ganesh.springdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:sport.properties")
public class KabaddiCoach implements Coach {

	@Value("${sport.name}")
	private String sportName;
	@Value("${sport.team}")
	private String sportTeam;

	@Autowired
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hello this is daily workout";
	}

	@Override
	public String getDailyFortuneService() {
		// TODO Auto-generated method stub
		return fortuneService.getFortuneService();
	}

	public String getDetails() {
		return "sport name:" + sportName + " sport team:" + sportTeam;
	}

}
