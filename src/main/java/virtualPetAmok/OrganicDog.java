package virtualPetAmok;

public class OrganicDog extends Pet implements OrganicPets, DogInterface {

	private int hunger;
	private int thirst;
	private int cageCleanliness;
	
	public OrganicDog() {
		hunger = 10; 
		boredom = 30;
		demeanor = "n/a";
		name = "";
		description = "";
	}

	@Override
	public int getCageCleanliness() {
		return cageCleanliness;
	}

	@Override
	public void cleanCage(int cleanValue) {
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
	public void water() {
		thirst -= 15;

	}

	@Override
	public void feed() {
		hunger -= 30;

	}

}
