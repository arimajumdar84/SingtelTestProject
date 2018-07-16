package com.singtel.testProject;

public class Bird extends Animal {
	
	public Animal liveWith;
	
	public void fly() {
		System.out.println("I am flying");
	}
	public void sound() {
		System.out.println("I am singing");
	}
	public Animal getLiveWith() {
		return liveWith;
	}
	public void setLiveWith(Animal liveWith) {
		this.liveWith = liveWith;
	}
	
	
	
}
