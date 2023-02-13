package com.sportyshoes.p3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })	
public class SportyShoesProject3Application {

	public static void main(String[] args) {
		SpringApplication.run(SportyShoesProject3Application.class, args);
	}

}
