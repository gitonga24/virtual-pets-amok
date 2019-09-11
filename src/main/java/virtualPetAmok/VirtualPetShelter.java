package virtualPetAmok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, Pet> pets = new HashMap<>();

	
	public void addPet(Pet pet) {
		pets.put( pet.getName(), pet);
		}
	
	
	
	
	
	public void addPet(OrganicCat organicCat) {
		pets.put(organicCat.getName(), organicCat);
		
	}

	

	public void addPet(RoboticCat roboticCat) {
		pets.put(roboticCat.getName(), roboticCat);
		
	}

	public void addPet(OrganicDog organicDog) {
		pets.put(organicDog.getName(), organicDog);
		
	}

	public void addPet(RoboticDog roboticDog) {
		pets.put(roboticDog.getName(), roboticDog);
		
	}
	
	public Collection<Pet> getAllPets() {
		return pets.values();
	}

}
