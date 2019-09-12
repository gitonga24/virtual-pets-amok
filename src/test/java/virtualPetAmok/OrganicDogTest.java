package virtualPetAmok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicDogTest {

	
	OrganicDog organicDogTest = new OrganicDog ("name", "descrption", "organic", 25, 50);
	
	@Test
	public void playShouldReduceBoredomBy15() {
		int boredomBefore = organicDogTest.getBoredom();
		organicDogTest.play();
		int boredomAfter = organicDogTest.getBoredom();
		assertEquals (boredomBefore - boredomAfter, 15);
	}
	
	@Test
	public void shouldReduceHungerBy13() {
		organicDogTest.setHunger(43);
		int test = organicDogTest.getHunger();
		assertEquals(test, 43);
	}
	

	@Test
	public void shouldModifyHealthLevelBy16() {
		organicDogTest.setHealth(16);
		int testHealth = organicDogTest.getHealth();
		assertEquals(testHealth, 16);
	}
	
	
	@Test
	public void cleaningCageShouldIncreaseCageCleanlinessBy50() {
		int testBefore = organicDogTest.getCageCleanliness();
		organicDogTest.cleanCage(50);
		int testAfter = organicDogTest.getCageCleanliness();
		assertEquals(testAfter - testBefore, 50);
		
	}
	
	
}



