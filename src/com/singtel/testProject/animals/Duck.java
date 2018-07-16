package com.singtel.testProject.animals;

import com.singtel.testProject.Animal;
import com.singtel.testProject.behaviour.SoundBehaviour;
import com.singtel.testProject.behaviour.SwimBehaviour;

public class Duck extends Animal implements SoundBehaviour, SwimBehaviour{

	SoundBehaviour soundBehaviour;
	SwimBehaviour  swimBehaviour;
	
	public Duck() {
		super();
	}

	public SoundBehaviour getSoundBehaviour() {
		return soundBehaviour;
	}

	public void setSoundBehaviour(SoundBehaviour soundBehaviour) {
		this.soundBehaviour = soundBehaviour;
	}

	public SwimBehaviour getSwimBehaviour() {
		return swimBehaviour;
	}

	public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
		this.swimBehaviour = swimBehaviour;
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("I can definately swim!!!");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Quack Quack");
	}
	
	
}
