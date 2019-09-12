package virtualPetAmok;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelterApp {


	public static void main(String[] args) {

		VirtualPetShelter pets = new VirtualPetShelter();
		
// constructor signature: (String name, String description, String demeanor, int boredom, int health);		
		
		
		OrganicCat garfiled = new OrganicCat("Garfield", "Fiesty and calm", "violent looking", 35, 40);
		RoboticCat spiderman = new RoboticCat ("spiderman", "Tall and Fast", "lovely", 5, 30);
		
		OrganicDog Joey = new OrganicDog("Joey", "Tall & handsome", "Neptune like", 25, 50);
		OrganicDog Tommy = new OrganicDog("Tommy", "The toy bitter", "well kempt", 25, 50);
		OrganicDog Sam = new OrganicDog("Sam", "I like me some milk cat", "organic", 25, 50);
		RoboticDog Teckno = new RoboticDog("Teckno", "Super intelligent", "genious", 76, 50);

		
		pets.addPet(garfiled);
		pets.addPet(spiderman);
		pets.addPet(Joey);
		pets.addPet(Tommy);
		pets.addPet(Sam);
		pets.addPet(Teckno);
		
		//pets.walkAllDogs();
		//pets.printAllPets();
		//pets.cleanDogCages();
		//pets.emmptyLitterBoxes();
		//pets.feedAllOrganicPets();
		//pets.waterAllOrganicPets();
		//pets.oilRoboticPets();
		//pets.playWithAllPets();
		//pets.tick();

		pets.displayUserChoicesToPick();	
		
			
		
		
	}

}
