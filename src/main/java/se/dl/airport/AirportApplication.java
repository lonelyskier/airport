package se.dl.airport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

/*
	Filters
		- SimpleFilter
		- CustomFilter
		- CustomURLFilter
	ScheduledTask klass för scheduleringsjobb
	Input Form validation (PersomForm, form, results)
	- anropa med http://localhost:9000/input/showForm

	Thymeleaf
	- ThymeleafController http://localhost:9000/webcontent/greeting?name=Dennis
	REST
	- http://localhost:9000/rest/hello

	COMMIT 3
	COMMIT 4

 */

// För schedulering
@EnableScheduling
@SpringBootApplication
public class AirportApplication {//extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AirportApplication.class, args);
	}
/*
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AirportApplication.class);
	}

 */
}