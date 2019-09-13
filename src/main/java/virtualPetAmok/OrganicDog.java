package virtualPetAmok;

public class OrganicDog extends Pet implements OrganicPetsInterface, DogInterface {

	private int hunger;
	private int thirst;
	private int cageCleanliness;
	
	
	@Override
	public int getHunger() {
		return hunger;
	}

	@Override
	public int getThirst() {
		return thirst;
	}

	@Override
	public void setHunger(int hunger) {
		this.hunger = hunger;
	}
	public void setcageCleanliness(int cleanValue) {
		cageCleanliness = cleanValue;
	}
	
	public OrganicDog(String name, String description, String demeanor, int boredom, int health) {
		hunger = 10; 
		this.boredom = boredom;
		this.demeanor = demeanor;
		this.name = name;
		this.description = description;
	}

	@Override
	public int getCageCleanliness() {
		return cageCleanliness;
	}

	@Override
	public void cleanCage() {
		int afterCleanlinessValue = cageCleanliness + 50;
		System.out.println(this.name +"'s cage has been cleaned. Cleanliness value has raised from "+ 
							cageCleanliness + " to " + afterCleanlinessValue);
		
	}

	@Override
	public void waterPets() {
		int initiaThirst = thirst;
		thirst -= 30;
		System.out.println(this.name + " has been watered. Thirst score before was: " + initiaThirst +": Thirst after: " + thirst);

	}

	@Override
	public void feedPets() {
		int initialHunger = hunger;
		hunger -= 30;
		System.out.println(this.name + " has been fed. Hunger score before was: " + initialHunger +": hunger after: " + hunger);
	}

	@Override
	public void walkDog() {
		System.out.println(this.name + " dog is walking");
		
	}

	@Override
	public void setThirst(int h) {
		this.thirst = h;		
	}

	@Override
	public void walkOrganicPets() {
		int initialBoredom = boredom;
		boredom =- 30;
		System.out.println("You have walked: " + this.name + ". "
				+ "The boredom level has dropped from " + initialBoredom + " to " + boredom );
	}

	@Override
	public void setCageCleanliness(int cc) {
		this.cageCleanliness = cc;
		
	}

}
