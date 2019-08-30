package virtualpet;

import java.util.Random;
import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		VirtualPet SmithsCat = new VirtualPet (15, 20, false, 20, false, "Sam");

		
		int userInput = 2;
//		SmithsCat.goToHospital();
				
		 do {
		printPetStatus(SmithsCat.hunger, SmithsCat.thirst, SmithsCat.waste, SmithsCat.boredom, SmithsCat.sick);	
		userInput = input.nextInt();
		
		switch (userInput) {
		
		case 1: SmithsCat.feedPet(); 
				//SmithsCat.tick();
				break;
				
		case 2: SmithsCat.waterPet();
				//SmithsCat.tick();
				break;
		
		case 3: SmithsCat.takePetToBathroom(); 
				//SmithsCat.tick();
				break;
		
		case 4: SmithsCat.playWithPet(); 
			//	SmithsCat.tick();
				break;
		
		case 5: SmithsCat.takePetToVet(); 
				SmithsCat.tick();
				break;
				
		default: 
	
		}
		}
		 while (userInput != 0);
		
		System.out.println("Thanks for playing");
	}

	private static void printPetStatus(int hunger, int thirst, boolean waste, int boredom, boolean sick) {
		System.out.println("PET STATUS: Scale values -5 to 55");
		System.out.print("Hunger: " + hunger);
		System.out.print("   Thirst: " + thirst);
		System.out.print("   Bathroom: " + waste);
		System.out.print("   Boredom: " + boredom);
		System.out.print("   Sick: " + sick + "\n");		
		
		System.out.println("1.  Feed the pet");
		System.out.println("2.  Get the pet water");
		System.out.println("3.  Take pet to the bathroom");
		System.out.println("4.  Play with the pet");
		System.out.println("5.  Take pet to the vet" + "\n");
		System.out.println("What would you like to do? Enter 0 to quit." + "\n");

	}
	
	

}
