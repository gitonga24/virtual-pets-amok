package virtualPetAmok;

public class OrganicDog extends Pet implements OrganicPetsInterface, DogInterface {

	private int hunger;
	private int thirst;
	private int cageCleanliness;
	
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
	public void cleanCage(int cleanValue) {
		System.out.println(this.name +"'s cage has been cleaned.");
		cageCleanliness += cleanValue;
	}

	
	public void setcageCleanliness(int cleanValue) {
		cageCleanliness = cleanValue;
	}

	
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

	@Override
	public void waterPets() {
		System.out.println(name + " has been watered.");
		thirst -= 15;

	}

	@Override
	public void feedPets() {
		System.out.println(name + " has been feed.");
		hunger -= 30;

	}

	@Override
	public void walkDog() {
		System.out.println(this.name + " dog is walking");
		
	}

}
