package com.surribas.backbone.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.surribas.backbone.config.MicroservicesCommunicationConfig;
import com.surribas.backbone.model.Person;

@RestController
@RequestMapping("/microservicesPoc")
public class PeopleController {
	
	@Autowired
	MicroservicesCommunicationConfig microservicesCommunicationConfig;

	private static List<Person> people = new ArrayList<>();
	
	@GetMapping("/person")
	public ResponseEntity<List<Person>> getAllPeople() {
		return new ResponseEntity<>(people,HttpStatus.OK);
	}
	
	@PostMapping("/person")
	public ResponseEntity<Person> saveNewPerson(@RequestBody Person person){
		people.add(person);
		return new ResponseEntity<>(person,HttpStatus.OK);
	}
	
	@GetMapping("/worldMapUrl/{id}")
	public String getWorldMapUrl(@PathVariable("id") Long id) {
		return connectToWorldMapMs(id);
		
	}
	
	
	private String connectToWorldMapMs(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> data = restTemplate.getForEntity(microservicesCommunicationConfig.getWorldMapURL()+"/microservicesPoc/country/"+id,  String.class);
		return data.getBody();
	}
	
}
