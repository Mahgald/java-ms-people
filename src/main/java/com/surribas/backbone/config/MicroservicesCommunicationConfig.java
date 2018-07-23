package com.surribas.backbone.config;

import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.util.UriComponentsBuilder;

@Configuration
public class MicroservicesCommunicationConfig {

	@Value("${microservices.worldmap.host}")
	private String worldMapHost;

	@Value("${microservices.worldmap.port}")
	private String worldMapPort;
	
	@Value("${microservices.worldmap.secure}")
	private boolean worldMapSecure;

	public URI getWorldMapURL() {
		return UriComponentsBuilder.fromHttpUrl((worldMapSecure ? "https://" : "http://") + worldMapHost+ ":" + worldMapPort).build().toUri();
	}

	
	
	
}
