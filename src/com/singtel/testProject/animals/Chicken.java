package com.singtel.testProject.animals;

import com.singtel.testProject.Animal;
import com.singtel.testProject.behaviour.FlyBehaviour;
import com.singtel.testProject.behaviour.SoundBehaviour;

public class Chicken extends Animal implements SoundBehaviour, FlyBehaviour {

	SoundBehaviour soundBehaviour;
	
	public Chicken() {
		super();
	}

	public SoundBehaviour getSoundBehaviour() {
		return soundBehaviour;
	}

	public void setSoundBehaviour(SoundBehaviour soundBehaviour) {
		this.soundBehaviour = soundBehaviour;
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Cluck Cluck");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I cannot fly :(");
	}
}
