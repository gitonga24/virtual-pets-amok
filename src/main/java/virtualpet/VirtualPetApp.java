package virtualpet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		VirtualPet SmithsCat = new VirtualPet (5, 10, false, 0, true, "Sam");
//		int hunger, int thirst, boolean waste, int boredom, boolean sick, String name
		
		int userInput;
		if (SmithsCat.hunger > 0) 
		System.out.println("Pet Hungry: Enter 1 to feed the pet" );
		
		userInput = input.nextInt();
		if (userInput == 1)
			feedMe(SmithsCat.name, SmithsCat.hunger);
		
		SmithsCat.tick();
		
		

	}

}
