package virtualPetAmok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class VirtualPetShelter {

	Map<String, Pet> pets = new HashMap<>();

	public void addPet(Pet pet) {
		pets.put(pet.getName(), pet);
	}

	public Collection<Pet> getAllPets() {
		return pets.values();
	}

	public void walkAllDogs() {
		for (Pet p : pets.values()) {
			if (p instanceof DogInterface)
				System.out.println(p.name + " dog has walked.");
		}
	}

	public void cleanDogCages() {
		for (Pet p : pets.values())
			if (p instanceof DogInterface)
				((DogInterface) p).cleanCage();
	}

	public void emptyLitterBoxes() {
		for (Pet p : pets.values())
			if (p instanceof CatInterface)
				((CatInterface) p).empyLitterBox(20);
	}

	public void feedAllOrganicPets() {
		for (Pet p : pets.values())
			if (p instanceof OrganicPetsInterface)
				((OrganicPetsInterface) p).feedPets();

	}

	public void waterAllOrganicPets() {
		for (Pet p : pets.values())
			if (p instanceof OrganicPetsInterface)
				((OrganicPetsInterface) p).waterPets();
	}

	public void displayAllPetsWithTheirDescriptions() {
		System.out.println("Name:   |Brief Description:");
		System.out.println("--------|-------------------");
		for (Pet p : pets.values())
			System.out.println(p.name + "\t " + p.description);
	}

	public void onBoardAPet(String petType, String name, String description) {
		if (petType.equals("1"))
			pets.put(name, new OrganicCat(name, description, "Organic Cat", 5, 10));
		if (petType.equals("2"))
			pets.put(name, new OrganicDog(name, description, "Organic Dog", 5, 10));
		if (petType.equals("3"))
			pets.put(name, new RoboticCat(name, description, "Robotic Cat", 5, 10));
		if (petType.equals("4"))
			pets.put(name, new RoboticDog(name, description, "Robotic Dog", 5, 10));
	}

	public void adoptAPet(String petToAdopt) {
		if (pets.containsKey(petToAdopt)) {
			pets.remove(petToAdopt);
			System.out.println("You have successfully adopted: " + petToAdopt + ". Enjoy your new company.");
		} else
			System.out
					.println("Hmmm... It doesn't look like we have: " + petToAdopt + " in our facility at the moment.");

	}

	public void playWithAPet(String petToPlayWith) {
		for (String p : pets.keySet()) {
			if (p.equals(petToPlayWith)) {
				System.out.println("You have played with: " + petToPlayWith);
			}
		}
		if (!(pets.containsKey(petToPlayWith)))
			System.out.println("Hmmmm It looks like we don't have " + petToPlayWith + " in our facility");
	}


	public void walkOrganicPetsOnly() {
		for (Pet p : pets.values())
			if (p instanceof OrganicPetsInterface)
				((OrganicPetsInterface) p).walkOrganicPets();
	}

	public void oilRoboticPets() {
		for (Pet p : pets.values())
			if (p instanceof RoboticPetInterface)
				((RoboticPetInterface) p).oilPet(50);
	}

	public void playWithAllPets() {
		for (Pet p : pets.values())
			p.play();
	}

	public void tick() {
		for (Pet p : pets.values()) {

			Random ranOilLevel = new Random();
			int o = ranOilLevel.nextInt(100);
			if (p instanceof RoboticPetInterface)
				((RoboticPetInterface) p).setOilLevel(o);

			Random ranHunger = new Random();
			int h = ranHunger.nextInt(100);
			if (p instanceof OrganicPetsInterface)
				((OrganicPetsInterface) p).setHunger(h);

			Random ranBoredom = new Random();
			int b = ranBoredom.nextInt(100);
			p.setBoredom(b);

			Random ranHealth = new Random();
			int health = ranHealth.nextInt(100);
			p.setHealth(health);

			Random randThirst = new Random();
			int t = randThirst.nextInt(100);
			if (p instanceof OrganicPetsInterface)
				((OrganicPetsInterface) p).setThirst(t);

			Random randCageCleanliness = new Random();
			int cC = randCageCleanliness.nextInt(100);
			if (p instanceof DogInterface)
				((DogInterface) p).setCageCleanliness(cC);

		}
	}

	public void printAllPets() {
		System.out.println("\nHere is an updated look at all of our pets");
		System.out.println("NAME:    |Make         |Health  |Boredom");
		System.out.println("-------- |-------------|--------|-------");

		for (Pet p : pets.values())
			System.out.println(p.getName() + "\t |" + p.getMake() + "  |" + +p.getHealth() + "\t|" + p.boredom);
	}

	public void displayUserChoicesToPick() {
		System.out.println("\n Here are your options to choose from:");
		System.out.println("1. Feed all organic  pets ");
		System.out.println("2. Water organic pets");
		System.out.println("3. Play with a pet ");
		System.out.println("4. Play with all pets ");
		System.out.println("5. Adopt a pet ");
		System.out.println("6. Admit a pet ");
		System.out.println("7. Walk all dogs");
		System.out.println("8. Walk organic pets only");
		System.out.println("9. Clean dog cages");
		System.out.println("10. Empty litter boxes");
		System.out.println("11. Oil robotic pets");
		System.out.println("12. Quit ");
	}

}
