package com.surribas.backbone.config;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Person implements Serializable{

	@Value("${app.person.name}")
	private String name;
	
	@Value("${app.person.apellido}")
	private String lastname;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastname=" + lastname + "]";
	}
	
	
	
}
