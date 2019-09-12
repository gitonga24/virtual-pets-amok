package virtualPetAmok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class VirtualPetShelter {

	Map<String, Pet> pets = new HashMap<>();

	
	public void addPet(Pet pet) {
		pets.put( pet.getName(), pet);
		}
	
	
	public Collection<Pet> getAllPets() {
		return pets.values();
	}
	
	
	public void printAllPets() {
		for(Pet p : pets.values() )
			System.out.println("Pets are: " + p.getHealth());		 
	}
	
	public void walkAllDogs() {
		for (Pet p: pets.values()) {
			if ( p instanceof DogInterface) 
				System.out.println( p.name + " dog has walked.");
		}		
	}
	
	public void cleanDogCages() {
		for (Pet p: pets.values())
			if (p instanceof DogInterface)
				((DogInterface) p).cleanCage(50);
	}
	
	public void emmptyLitterBoxes() {
		for (Pet p: pets.values())
			if (p instanceof CatInterface)
				((CatInterface) p).empyLitterBox(20);
	}
	
	public void feedAllOrganicPets() {
		for (Pet p: pets.values())
			if (p instanceof OrganicPetsInterface)
				((OrganicPetsInterface) p) .feedPets();
		
	}
	
	public void waterAllOrganicPets() {
		for (Pet p: pets.values())
			if (p instanceof OrganicPetsInterface)
				((OrganicPetsInterface) p) .waterPets();
	}
	
	
	public void oilRoboticPets() {
		for (Pet p: pets.values())
			if (p instanceof RoboticPetInterface)
				((RoboticPetInterface) p) .oilPet(50);
	}
	
	public void playWithAllPets() {
		for (Pet p: pets.values())
			p.play();
	}
	
	
	public void tick() {
		for (Pet p: pets.values()) {
			
			Random ranOilLevel = new Random();
			int o = ranOilLevel.nextInt(100);
			if (p instanceof RoboticPetInterface) 
				((RoboticPetInterface) p) .setOilLevel(o);
		
			
			Random ranHunger = new Random();
			int h = ranHunger.nextInt(100);		
			if (p instanceof OrganicPetsInterface)
				((OrganicPetsInterface) p). setHunger(h);
			
			Random ranBoredom = new Random();
			int b = ranBoredom.nextInt(100);
			p.setBoredom(b);
			
			Random ranHealth = new Random();
			int health = ranHealth.nextInt(100);
			p.setHealth(health);
			
				
		}
				
			
			
		
		
	}

	
	public void displayUserChoicesToPick() {
		System.out.println("Here are your options:");
		System.out.println("1. Feed all organic  pets ");
		System.out.println("2. Water organic pets");
		System.out.println("3. Play with a pet ");
		System.out.println("4. Play with all pets ");
		System.out.println("5. Adopt a pet ");
		System.out.println("6. Admit a pet ");
		System.out.println("7. Walk all dogs");
		System.out.println("8. Walk all organic pets");
		System.out.println("9. Clean dog cages");
		System.out.println("10. Empty litter boxes");
		System.out.println("11. Oil robotic pets");
		System.out.println("12. Quit ");
	}

}
