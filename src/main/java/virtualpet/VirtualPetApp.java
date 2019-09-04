package virtualpet;

import java.util.Random;
import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		VirtualPet SmithsCat = new VirtualPet (10, 25, false, 20, false, "Sam");

		
		int userInput = 2;
//		SmithsCat.goToHospital();
				
		 do {
		printPetStatus(SmithsCat.hunger, SmithsCat.thirst, SmithsCat.waste, SmithsCat.boredom, SmithsCat.sick);	
		userInput = input.nextInt();
		
		switch (userInput) {
		
		case 0: SmithsCat.feedPet("Macoroni & Cheese"); 
				break;
				
		case 1: SmithsCat.feedPet("Other"); 
				break;
				
		case 2: SmithsCat.waterPet();
				break;
		
		case 3: SmithsCat.takePetToBathroom(); 
				break;
		
		case 4: SmithsCat.playWithPet(); 
				break;
		
		case 5: SmithsCat.takePetToVet(); 
				break;
				
		default: 
			SmithsCat.tick();
		}
		}
		 while (userInput != -1);
		
		System.out.println("Thanks for playing");
	}

	private static void printPetStatus(int hunger, int thirst, boolean waste, int boredom, boolean sick) {
		System.out.println("\n" + "PET STATUS: Scale values -5 to 55");
		System.out.print("Hunger: " + hunger);
		System.out.print("   Thirst: " + thirst);
		System.out.print("   Bathroom: " + waste);
		System.out.print("   Boredom: " + boredom);
		System.out.print("   Sick: " + sick + "\n" + "\n");		
		
		System.out.println("0.  Feed the pet Macoroni & Cheese, a favorite");
		System.out.println("1.  Feed the pet Other - not favorite");
		System.out.println("2.  Get the pet water");
		System.out.println("3.  Take pet to the bathroom");
		System.out.println("4.  Play with the pet");
		System.out.println("5.  Take pet to the vet");
		System.out.println("6.  Pass Time - Change pet status" + "\n");
		System.out.println("What would you like to do? Enter -1 to quit." + "\n");

	}
	
	TestPet JamesPet = new TestPet ("MickeyMouse", "Bones", 30, 10);
	
//	JamesPet.AssignHeight(50);
	

}
