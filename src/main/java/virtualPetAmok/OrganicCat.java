package virtualPetAmok;

public class OrganicCat extends Pet implements OrganicPetsInterface, CatInterface {

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
	
	public OrganicCat(String name, String description, String demeanor, int boredom, int health) {
		this.hunger = 20;
		this.boredom = boredom;
		this.demeanor = demeanor;
		this.name = name;
		this.description = description;
		this.thirst = 25;
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
		System.out.println(this.name + "'s litterbox has been emptied");
		LitterBoxCleanliness += i;

	}

	@Override
	public void waterPets() {
		System.out.println(name + " has been watered.");
		thirst -= 15;
	}



	@Override
	public void feedPets() {
		System.out.println(this.name + " has been fed.");
		hunger -= 30;
		
	}

}
