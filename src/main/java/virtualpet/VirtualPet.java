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

	
	
	

	/*void goToHospital() {
		System.out.println(name + " just saw Dr. Dolittle.  He is now well");
		sick = false;
	}*/
	
	public void feedPet() {	
		System.out.println("You fed the pet" + "\n");	
		hunger += 10;
	}
	
	public void waterPet() {	
		System.out.println("The pet has quenched his thirst" + "\n");
	}
	
	public void takePetToBathroom() {	
		System.out.println("Bathroom need all taken care of" + "\n");
	}
	
	public void playWithPet() {	
		System.out.println("Pet feels exited from a moment of some fun. Thank you" + "\n");
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


