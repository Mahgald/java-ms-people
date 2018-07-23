package com.surribas.backbone.model;

public class Person{

	private Long id;
	
	private String name;
	
	private String lastName;
	
	private int age;
	
	private Long addressRef;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Long getAddressRef() {
		return addressRef;
	}

	public void setAddressRef(Long addressRef) {
		this.addressRef = addressRef;
	}
}
