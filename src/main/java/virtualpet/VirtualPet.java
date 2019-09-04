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
	String favoriteFood = "Macoroni";
	
	
	
	public VirtualPet(int hunger, int thirst, boolean waste, int boredom, boolean sick, String name) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.waste = waste;
		this.boredom = boredom;
		this.sick = sick;
		this.name = name;

	}

	
	
	


	
	public void feedPet(String favoriteFood) {	
		if (favoriteFood != "Macoroni & Cheese" && hunger <10) {
			System.out.println("Sam says he's not too hungry for other kind of food");
			return;
		}
		
		if (hunger < 0) {sick = true;
		System.out.println("Pet has had too much and is now sick");
		return;
			}
		
		System.out.println("You fed the pet but it's now thirsty and needs to use the bathroom");	
		if (hunger > -5 )hunger -= 5;
		
		if (thirst <= 50) thirst +=5;
		else {
			sick = true;
			System.out.println("Pet is dehidrated and is now sick");
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
		if (waste == false)
			System.out.println("Sam does not need to use the bathroom");
		else {
		waste = false;
		System.out.println("Bathroom need all taken care of");
		}
	}
	
	public void playWithPet() {	
		if (sick == true) {
			System.out.println("pet is sick and cannot play");
			return;
		}
			
		System.out.println("Pet has played");
		if (boredom >= 0) boredom -= 5;
		else {
			sick = true;
			System.out.println("Pet is now fatigued and sick");
		}
	}	
	
	public void takePetToVet() {	
		if (sick == false) {
			System.out.println("Sam is not sick and does not need a vet");
			return;
		}
		
		System.out.println(name + " just saw Dr. Dolittle.  He is now well");
		sick = false;
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
	
//	public TestPet (String name, String favFood, int weight, int height) 
	TestPet JamesPet = new TestPet ("MickeyMouse", "Bones", 30, 10);
	
//	JamesPet.AssignHeight(50);

	
}


