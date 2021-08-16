package ca.shubbar.jokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokesAppApplication.class, args);
		System.out.println("Hello Spring!");
	}

}
