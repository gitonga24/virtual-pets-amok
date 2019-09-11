package virtualPetAmok;

public class OrganicCat extends Pet implements OrganicPets, CatInterface {

	private int LitterBoxCleanliness;
	private int hunger;
	private int thirst;
	@Override
	public int getHunger() {
		return hunger;
	}

	@Override
	public int getLitterBoxCleanliness() {
		return LitterBoxCleanliness;
	}
	@Override
	public int getThirst() {
		return thirst;
	}

	@Override
	public void setHunger(int hunger) {
		this.hunger = hunger;	
	}
	
	public OrganicCat(String name, String description, String make, int boredom, int hunger, int thirst, int health) {
		this.hunger = hunger;
		this.boredom = boredom;
		this.demeanor = make;
		this.name = name;
		this.description = description;
		this.thirst = thirst;
		this.health = health;
	}

	public OrganicCat() {
		hunger = 10; 
		boredom = 30;
		demeanor = "n/a";
		name = "";
		description = "";
		
	}



	@Override
	public void empyLitterBox(int i) {
		LitterBoxCleanliness += i;

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
