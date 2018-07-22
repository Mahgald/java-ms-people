package com.surribas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.surribas.backbone.config.Person;

@SpringBootApplication
@Import({Person.class})
public class JavaMsPeopleApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(JavaMsPeopleApplication.class, args);
	}
}
