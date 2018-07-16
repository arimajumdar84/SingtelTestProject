package com.singtel.testProject;

public class Animal {

	private String name;
	private String liveWith;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void walk() {
		System.out.println("I am walking");
	}
	
	public void sound() {
		System.out.println("Do i make sound?");
	}
	
	public void fly() {
		System.out.println("Do i fly?");
	}
}
