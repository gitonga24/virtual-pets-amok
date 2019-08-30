package virtualpet;

import java.util.Random;

public class VirtualPet {
	
	int hunger ;
	int thirst ;
	boolean waste ;
	int boredom ;
	boolean sick; 
	String name ; 
	int Rand; 
	
	
	
	public VirtualPet(int hunger, int thirst, boolean waste, int boredom, boolean sick, String name) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.waste = waste;
		this.boredom = boredom;
		this.sick = sick;
		this.name = name;

	}

	
	
	


	
	public void feedPet() {	
	/*	if (hunger <= -5) {
			System.out.println("Pet has had enough to eat");
			return;
		}
	*/	
		System.out.println("You fed the pet but it's now thirsty and needs to use the bathroom" + "\n");	
		if (hunger > -5 )hunger -= 5;
		if (thirst <= 50) thirst +=5;
		if (thirst > 50) {
			sick = true;
			System.out.println("Pet is dehidrated and is now sick");
		}
		if (hunger < 0) {sick = true;
			System.out.println("Pet has had too much and is now sick");
		}
		waste = true;
	}
	
	public void waterPet() {
		if (thirst <= -5) {
			System.out.println("Pet has had enough to drink");
			return;
		}
		
		System.out.println("The pet has had to drink but now needs to use the bathroom");
		if (thirst >= 0) thirst -=5;
		if (thirst < 0) {
			sick = true;
			System.out.println("Pet had too much to drink and is now sick!!");
		}
		waste = true;
	}
	
	public void takePetToBathroom() {	
		waste = false;
		System.out.println("Bathroom need all taken care of");
	}
	
	public void playWithPet() {	
		if (sick == true) {
			System.out.println("pet is sick and cannot play");
			return;
		}
			
		System.out.println("Pet has played" + "\n");
		if (boredom >= 0) boredom -= 5;
		if (boredom < 0) {
			sick = true;
			System.out.println("Pet is now fatigued and sick");
		}
	}	
	
	public void takePetToVet() {	
		System.out.println(name + " just saw Dr. Dolittle.  He is now well");
	}

	public  void tick( ) {
		
		Random rand = new Random(); 
		int h = rand.nextInt(5);
		hunger = h * 5;
		
		
		Random randt = new Random(); 
		int t = randt.nextInt(5);
		thirst = t * 5;
		
		Random randbathroom = new Random(); 
		int bath = randbathroom.nextInt(5);
		if (bath%2 == 0) waste = false; 
		else waste = true;
		
		Random randboredom = new Random(); 
		int intboredom = randboredom.nextInt(5);
		boredom = intboredom * 5;
		
		Random randSick = new Random(); 
		int intSick = randSick.nextInt(5);
		if (intSick%2 == 0) sick = false; 
		else sick = true;
	
	}

	
}


