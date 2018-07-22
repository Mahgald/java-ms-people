package com.surribas.backbone.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surribas.backbone.config.Person;

@RestController
public class PeopleController {

	@Autowired
	private Person person;
	
	
	@GetMapping("/person")
	public Map<String,String> getPersonConfig() {
		Map<String,String> mapa = new HashMap<>();
		
		mapa.put("LastName", person.getLastname());
		mapa.put("Name", person.getName());
		
		return mapa;
	}
	
}
