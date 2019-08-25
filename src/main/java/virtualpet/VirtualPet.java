package virtualpet;

public class VirtualPet {
	
	/*
	hunger (feed it)
	thirst (water it)
	waste (let it out to the bathroom)
	boredom (play with it)
	sickness (take it to the doctor) */
	
	int hunger ;
	int thirst ;
	boolean waste ;
	int boredom ;
	boolean sick; 
	String name ; 
	
	
	
	public VirtualPet(int hunger, int thirst, boolean waste, int boredom, boolean sick, String name) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.waste = waste;
		this.boredom = boredom;
		this.sick = sick;
		this.name = name;

	}

	
	
	public void tick() {
		if (hunger > 0)
			feedMe(name, hunger);
		
		if (sick == true) 
			goToHospital(name, sick);
		
	}

	private void goToHospital(String name, boolean sick) {
		System.out.println(name + " just saw Dr. Dolittle.  He is now well");
		sick = false;	
	}
	
	void feedMe(String name,  int hunger) {
		hunger = 0;
		System.out.println(name + " is hungry. we just ate. The hunger value is now: " + hunger);
		
	}

}
