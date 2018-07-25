package com.surribas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;

import com.surribas.backbone.config.MicroservicesCommunicationConfig;
import com.surribas.backbone.controller.PeopleController;
import com.surribas.backbone.model.Person;

@SpringBootApplication
@EnableDiscoveryClient
@Import({ MicroservicesCommunicationConfig.class })
public class JavaMsPeopleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaMsPeopleApplication.class, args);
	}

	@Bean
	@LoadBalanced // adding this line solved the issue
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	PeopleController peopleController() {
		return new PeopleController();
	}
}
