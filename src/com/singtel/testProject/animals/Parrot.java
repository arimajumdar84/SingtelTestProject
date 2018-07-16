package com.singtel.testProject.animals;

import com.singtel.testProject.Bird;
import com.singtel.testProject.behaviour.FlyBehaviour;
import com.singtel.testProject.behaviour.SoundBehaviour;

public class Parrot extends Bird implements FlyBehaviour, SoundBehaviour{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		if(this.getLiveWith() instanceof Chicken) {
			System.out.println("Cluck Cluck");
		} else if(this.getLiveWith() instanceof Dog) {
			System.out.println("Woof Woof");
		} else {
			System.out.println("I am happy and i am singing");
		}
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

}
