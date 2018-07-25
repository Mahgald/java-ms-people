package com.surribas.backbone.config;

import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.util.UriComponentsBuilder;

@Configuration
public class MicroservicesCommunicationConfig {

	@Value("${microservices.worldmap.name}")
	private String worldMapName;

	
	public URI getWorldMapURL() {
		return UriComponentsBuilder.fromHttpUrl("http://"+worldMapName).build().toUri();
	}
	
	
	
	
}
