package test.singtel.testProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.singtel.testProject.Bird;
import com.singtel.testProject.Solution;
import com.singtel.testProject.animals.Dog;
import com.singtel.testProject.animals.Parrot;

class SolutionTest {

	@Test
	void test() {
		Solution solution = new Solution();
		//Initialize different objects to test the animals
		Bird bird = new Bird();
		Dog dog = new Dog();
		Parrot parrot = new Parrot();
		parrot.setLiveWith(dog);
		solution.animalBehaviour(parrot);	
	}

}
