package javaoop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnimalTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void birdTest() {
		Animal homosapien = new Animal("Homo");
		homosapien.setColor(Color.BLACK);
		
		Bird pepeye = new Bird();
		pepeye.setName("Philemon");
		pepeye.setWeight(3);
		pepeye.setColor(Color.BROWN);
		pepeye.setLeftWing(Wing.LEFT_SMALL_WING);
		pepeye.setRightWing(Wing.RIGHT_SMALL_WING);
		
		assertNotEquals(homosapien, pepeye);
	}
	
	@Test
	void polymorphismTest() {
		Animal eyele = new Pigeon();
		moveAnimal(eyele);
		
		Bird anotherPigeon = new Pigeon();
		Pigeon myPigeon = new Pigeon();
		
		Animal bingo = new Dog("Bingo");
		assertEquals("Bingo", bingo.getName());
		
		//eyele.move();
		bingo.move();
	}
	
	public void moveAnimal(Animal anAnimal) {
		anAnimal.move();
	}
	
	void moveBird(Bird theBird) {
		theBird.move();
	}
	
	void movePigeon(Pigeon aPigeon) {
		aPigeon.move();
	}

	@Test
	void animalMoveTest() {
		Animal[] animals = new Animal[3];
		
		Pigeon myPigeon = new Pigeon("Eyele");
		animals[0] = myPigeon;
		
		Dog myDog = new Dog("Simba");
		animals[1] = myDog;
		
		Fish myFish = new Fish("Eja nla");
		animals[2] = myFish;
		//myFish.setName("Eja nla");
		
		
		for(Animal animal : animals) {
			animal.move();
		}
		
	}
}
