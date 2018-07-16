package com.singtel.testProject;

import com.singtel.testProject.animals.Chicken;
import com.singtel.testProject.animals.Dog;
import com.singtel.testProject.animals.Parrot;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird bird = new Bird();
		//bird.walk();
		//bird.fly();
		//bird.sing();
		new Solution().animalBehaviour(bird);
		
		
		Chicken chicken = new Chicken();
		//chicken.sound();
		new Solution().animalBehaviour(chicken);
		Parrot parrot = new Parrot();
		parrot.setLiveWith(new Dog());
		//parrot.sound();
		new Solution().animalBehaviour(parrot);
		
		
	}
	
	public void animalBehaviour(Animal animal) {
		System.out.println("I am "+animal.getClass().getSimpleName());
		animal.fly();
		animal.sound();
	}

}
