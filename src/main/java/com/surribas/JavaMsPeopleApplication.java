package com.surribas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

import com.surribas.backbone.config.MicroservicesCommunicationConfig;
import com.surribas.backbone.model.Person;

@SpringBootApplication
@EnableDiscoveryClient
@Import({MicroservicesCommunicationConfig.class})
public class JavaMsPeopleApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(JavaMsPeopleApplication.class, args);
	}
}
