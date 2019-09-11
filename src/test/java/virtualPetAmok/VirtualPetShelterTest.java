package virtualPetAmok;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import java.util.Collection;

import org.junit.Test;

public class VirtualPetShelterTest {


		VirtualPetShelter virtualPetShelter = new VirtualPetShelter();
		 
		
		@SuppressWarnings("deprecation")
		@Test
		public void shouldBeAbleToAddNewPet() {
			OrganicCat organicCat = new OrganicCat("Garfield", "Fiesty and calm", "Robot", 0, 0, 0, 0);
			virtualPetShelter.addPet(organicCat);
			Collection <Pet> check = virtualPetShelter.getAllPets();
			assertThat (check, contains(organicCat));					
		}
		
		@Test
		public void shouldBeAbleToAddTwoPets() {
			OrganicCat organicCat = new OrganicCat();
			RoboticCat roboticCat = new RoboticCat();			
			virtualPetShelter.addPet(organicCat);
			virtualPetShelter.addPet(roboticCat);
			Collection <Pet> check = virtualPetShelter.getAllPets();
			assertThat (check, contains(organicCat, roboticCat));
		}
		
		@Test
		public void shouldBeAbleToAddThreePets() {
			OrganicCat organicCat = new OrganicCat();
			RoboticCat roboticCat = new RoboticCat();	
			OrganicDog organicDog = new OrganicDog();
			//virtualPetShelter.addPet(organicCat);
			virtualPetShelter.addPet(roboticCat);
			virtualPetShelter.addPet(organicDog);
			Collection <Pet> check = virtualPetShelter.getAllPets();
			assertThat (check, contains( roboticCat, organicDog));
		}
		
		
		@Test
		public void shouldBeAbleToAddRoboticDog() {
			RoboticDog roboticDog = new RoboticDog();
			virtualPetShelter.addPet(roboticDog);
			Collection<Pet> check = virtualPetShelter.getAllPets();
			assertThat (check, contains(roboticDog));
		}
		
		@Test
		public void shouldBeAbleToWalkDogs() {
			OrganicDog organicDog = new OrganicDog();
			
			
			
		}





}



