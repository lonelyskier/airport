package se.dl.airport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class AirportApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirportApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String hello() {
		return "Hello World";
	}
}