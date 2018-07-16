package com.singtel.testProject.animals;

import com.singtel.testProject.Animal;
import com.singtel.testProject.behaviour.SoundBehaviour;

public class Rooster extends Animal implements SoundBehaviour{

	SoundBehaviour soundBehaviour;

	public SoundBehaviour getSoundBehaviour() {
		return soundBehaviour;
	}

	public void setSoundBehaviour(SoundBehaviour soundBehaviour) {
		this.soundBehaviour = soundBehaviour;
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Cock a doodle doo");
	}
}
