package virtualPetAmok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoboticCatTest {
	
	RoboticCat roboticCatTest = new RoboticCat ("name", "descrption", "organic", 25, 50);
	
	@Test
	public void emptyLitterBoxShouldIncreaseLitterboxCleanlinessBy20() {
		
		roboticCatTest.setLitterBoxCleanliness(30);
		roboticCatTest.empyLitterBox(20);	
		int testCleanliness = roboticCatTest.getLitterBoxCleanliness();
		assertEquals(testCleanliness, 50);			
	}
	
	@Test
	public void playShouldIncreaseHealthBy5() {
		int healthBeforePlay = roboticCatTest.getHealth();
		roboticCatTest.play();
		int healthAfterPlay = roboticCatTest.getHealth();
		assertEquals (healthAfterPlay - healthBeforePlay, 5);
	}
	
	@Test
	public void playShouldReduceBoredomBy15() {
		int boredomeBeforePlay = roboticCatTest.getBoredom();
		roboticCatTest.play();
		int boredomAfterPlay = roboticCatTest.getBoredom();
		assertEquals (boredomeBeforePlay - boredomAfterPlay, 15);
	}
	
	@Test
	public void testIfShouldReturnPetMake() {
		roboticCatTest.setMake("Robottest");
		String makeTest = roboticCatTest.getMake();
		assertEquals (makeTest, "Robottest");
	}
	
	@Test
	public void testIfReduceBoredomBy15AfterPlay() {
		int testBefore = roboticCatTest.getBoredom();
		roboticCatTest.play();
		int testAfter = roboticCatTest.getBoredom();
		assertEquals (testBefore - testAfter, 15);
	}
	

}
