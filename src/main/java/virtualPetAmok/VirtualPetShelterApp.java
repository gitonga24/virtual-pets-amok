package virtualPetAmok;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		VirtualPetShelter pets = new VirtualPetShelter();
		

		OrganicCat gary = new OrganicCat("Garry", "violent looking", "Organic dog", 35, 40);
		RoboticCat skyman = new RoboticCat("skyman", "lovely", "Robotic cat", 5, 30);
		OrganicDog Joey = new OrganicDog("Joey", "Neptune like", "Organic cat", 25, 50);
		OrganicDog Tommy = new OrganicDog("Tommy", "well kempt", "Organic dog", 25, 50);
		OrganicDog Sam = new OrganicDog("Sam", "sassy and cool", "Organic cat", 25, 50);
		RoboticDog Teckno = new RoboticDog("Teckno", "genious", "Robotic dog", 76, 50);

		pets.addPet(gary);
		pets.addPet(skyman);
		pets.addPet(Joey);
		pets.addPet(Tommy);
		pets.addPet(Sam);
		pets.addPet(Teckno);
		pets.tick();

		System.out.println("Welcome to Doggy Cattie Animal Shelter. ");
		System.out.println("We have a number of activities lined up for you during your visit");
		pets.printAllPets();
		pets.displayUserChoicesToPick();

		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();

		while (!(userInput.equals("12"))) {
			if (userInput.equals("1")) {
				pets.tick();
				pets.feedAllOrganicPets();

			}

			if (userInput.equals("2")) {
				pets.tick();
				pets.waterAllOrganicPets();

			}

			if (userInput.equals("3")) {
				System.out.println("OK. You'd like to play with a pet. Here is what we have:");
				pets.displayAllPetsWithTheirDescriptions();
				System.out.println("Please enter the name of the pet you'd like to play with");
				String userInputOption3 = input.nextLine();
				pets.playWithAPet(userInputOption3);
			}

			if (userInput.equals("4")) { // play with all pets
				pets.tick();
				pets.playWithAllPets();
			}

			if (userInput.equals("5")) { // adopt a pet
				System.out.println("OK. Great. You'd like to adopt a pet. Here is what we currently have: ");
				pets.displayAllPetsWithTheirDescriptions();
				System.out.println("Please enter the pet's name that you'd like to adopt: ");
				String userInput5 = input.nextLine();
				pets.adoptAPet(userInput5);
			}

			if (userInput.equals("6")) { // onboard(adimit) pet
				System.out.println("OK Great.  Our pet shelter has space for a new pet: ");
				pets.displayAllPetsWithTheirDescriptions();
				System.out.println("Below are the pet types that we shelter:");
				System.out.println("1. Organic Cats");
				System.out.println("2. Organic Dogs");
				System.out.println("3. Robotic Cats");
				System.out.println("4. Robotic Dogs");
				System.out.println("Please enter the number (1-4) for the type of pet you'd like to onboard");
				String userPetTypeInput = input.nextLine();
				System.out.println("Please enter the pet's name that you'd like to onboard");
				String userPetNameInput = input.nextLine();
				System.out.println("Please give us a brief description of what " + userPetNameInput + " is like:");
				String userPetDescriptionInput = input.nextLine();
				pets.onBoardAPet(userPetTypeInput, userPetNameInput, userPetDescriptionInput);
				System.out.println("Below is the update List:");
				pets.displayAllPetsWithTheirDescriptions();
			}

			if (userInput.equals("7")) // walk all dogs.
				pets.walkAllDogs();

			if (userInput.equals("8")) // walk organic pets only
				pets.walkOrganicPetsOnly();

			if (userInput.equals("9")) { // clean dogs' cages.
				pets.tick();
				pets.cleanDogCages();
			}

			if (userInput.equals("10")) { // Empty litter boxes
				pets.tick();
				pets.emptyLitterBoxes();
			}

			if (userInput.equals("11")) { // oil robotic pets.
				pets.tick();
				pets.oilRoboticPets();
			}

			pets.displayUserChoicesToPick();
			System.out.println("\nWhat else would you like to do?");
			userInput = input.nextLine();

		} // end while

		System.out.println("Thanks for playing");

	}

}
