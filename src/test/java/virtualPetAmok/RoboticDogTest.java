package virtualPetAmok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RoboticDogTest  {
	
	RoboticDog roboticDogTest = new RoboticDog("name", "descrption", "organic", 25, 50);
	
	
	@Test
	public void oilingPetShouldIncreaseOilLevelBy40() {
		roboticDogTest.setOilLevel(20);
		roboticDogTest.oilPet(40);
		int afterOiling = roboticDogTest.getOilLevel();
		assertEquals(afterOiling, 60);
	}

	@Test
	public void cleaningCageShouldMaintainCageCleanliness() {
		int testBefore = roboticDogTest.getCageCleanliness();
		roboticDogTest.cleanCage();
		int testAfter = roboticDogTest.getCageCleanliness();
		assertEquals(testAfter - testBefore, 0);
		
	}



}
