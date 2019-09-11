package virtualPetAmok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoboticDogTest  {
	
	RoboticDog roboticDogTest = new RoboticDog();
	
	
	@Test
	public void oilingPetShouldIncreaseOilLevelBy40() {
		roboticDogTest.setOilLevel(20);
		roboticDogTest.oilPet(40);
		int afterOiling = roboticDogTest.getOilLevel();
		assertEquals(afterOiling, 60);
	}

	@Test
	public void cleaningCageShouldIncreaseCageCleanlinessBy50() {
		int testBefore = roboticDogTest.getCageCleanliness();
		roboticDogTest.cleanCage(50);
		int testAfter = roboticDogTest.getCageCleanliness();
		assertEquals(testAfter - testBefore, 50);
		
	}



}
