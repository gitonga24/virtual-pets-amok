package virtualPetAmok;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrganicCatTest {
	
	OrganicCat organicCatTest = new OrganicCat ("name", "descrption", "organic", 25, 50);
	
	@Test
	public void cleaningLitterBoxShouldIncreaseLitterboxCleanilinessBy10() {
		
		CatInterface organicCatTest = new OrganicCat ("name", "description", "make", 25, 50);
		int Cleanlinessbefore = organicCatTest.getLitterBoxCleanliness(); 
		organicCatTest.empyLitterBox(10);
		int Cleanlinessafter = organicCatTest.getLitterBoxCleanliness();
		assertEquals ( Cleanlinessafter - Cleanlinessbefore, 10);			
	}

	
	@Test
	public void shouldReturnHungervalue() {
		OrganicPetsInterface organicCatTest = new OrganicCat ("name", "descrption", "make", 25, 50);
		organicCatTest.setHunger(50);
		int hunger = organicCatTest.getHunger();
		assertEquals (hunger, 50);	
	}
	
	@Test 
	public void shouldReduceBoredomBy15afterPlay() {
		int valueBeforePlay = organicCatTest.getBoredom();
		organicCatTest.play();
		int valueAfterPlay = organicCatTest.getBoredom();
		assertEquals (valueBeforePlay - valueAfterPlay, 15 );						
	}
	
	@Test
	public void shouldReturnMakeValueOfOrganic() {
		String test = organicCatTest.getMake();
		assertEquals (test, "organic");		
	}
	
	@Test
	public void shouldReturnCollectPetNameasMike() {
		Pet organicCatTest = new OrganicCat ("Mike", "descrption", "organic", 30, 50);
		String test = organicCatTest.getName();
		assertEquals (test, "Mike" );		
	}
	
	@Test
	public void shouldReturnDescriptionAsLikeableAndSassy() {
		Pet organicCatTest = new OrganicCat ("name", "Likeable and Sassy", "make", 25, 50);
		String test = organicCatTest.getDescription();
		assertEquals (test, "Likeable and Sassy");	
	}
	
	@Test
	public void waterShouldReduceThirstBy30() {
		int beforeWatering = organicCatTest.getThirst();
		organicCatTest.waterPets();
		int aftetWatering = organicCatTest.getThirst();
		assertEquals ( beforeWatering - aftetWatering, 30);
	}
	
	@Test
	public void playShouldIncreaseHealthBy5() {
		Pet organicCatTest = new OrganicCat ("name", "Likeable and Sassy", "make", 25, 50);
		int healthBeforePlay = organicCatTest.getHealth();
		organicCatTest.play();
		int healthAfterPlay = organicCatTest.getHealth();
		assertEquals (healthAfterPlay - healthBeforePlay, 5 );
		
	}
	
	@Test
	public void feedingCatShouldDecreaseHungerBy30() {
		organicCatTest.setHunger(50);
		organicCatTest.feedPets();
		int hungerAfterFeeding = organicCatTest.getHunger();
		assertEquals (hungerAfterFeeding, 20 );
	}
}
