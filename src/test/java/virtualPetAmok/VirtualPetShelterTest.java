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
			OrganicCat organicCat = new OrganicCat("name", "descrption", "organic", 25, 50);
			virtualPetShelter.addPet(organicCat);
			Collection <Pet> check = virtualPetShelter.getAllPets();
			assertThat (check, contains(organicCat));					
		}
		
		@Test
		public void shouldBeAbleToAddTwoPets() {
			OrganicCat organicCat = new OrganicCat("name", "descrption", "organic", 25, 50);
			RoboticCat roboticCat = new RoboticCat("name2", "descrption", "organic", 25, 50);			
			virtualPetShelter.addPet(organicCat);
			virtualPetShelter.addPet(roboticCat);
			Collection <Pet> check = virtualPetShelter.getAllPets();
			assertThat (check, contains(organicCat, roboticCat));
		}
		
		@Test
		public void shouldBeAbleToAddTwoDifferentPets() {
			OrganicCat organicCat = new OrganicCat("name", "descrption", "organic", 25, 50);
			RoboticCat roboticCat = new RoboticCat("name1", "descrption", "organic", 25, 50);	
			OrganicDog organicDog = new OrganicDog("name2", "descrption", "organic", 25, 50);
			virtualPetShelter.addPet(organicCat);
			virtualPetShelter.addPet(roboticCat);
			//virtualPetShelter.addPet(organicDog);
			Collection <Pet> check = virtualPetShelter.getAllPets();
			assertThat (check, contains(organicCat, roboticCat ));
		}
		
		
		@Test
		public void shouldBeAbleToAddRoboticDog() {
			RoboticDog roboticDog = new RoboticDog("name", "descrption", "organic", 25, 50);
			virtualPetShelter.addPet(roboticDog);
			Collection<Pet> check = virtualPetShelter.getAllPets();
			assertThat (check, contains(roboticDog));
		}
		
		@Test
		public void shouldBeAbleToWalkDogs() {
			OrganicDog organicDog1 = new OrganicDog("Dog 1", "descrption", "organic", 25, 50);
			OrganicDog organicDog2 = new OrganicDog("Dog 2", "descrption", "organic", 25, 50);
			OrganicDog organicDog3 = new OrganicDog("Dog 3", "descrption", "organic", 25, 50);
			RoboticDog roboticDog3 = new RoboticDog("Dog 3", "descrption", "organic", 25, 50);
			virtualPetShelter.addPet(organicDog1);
			virtualPetShelter.addPet(organicDog2);
			virtualPetShelter.addPet(organicDog3);
			virtualPetShelter.addPet(roboticDog3);
		}





}



