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
		int litterBoxCleanlinessBefore = LitterBoxCleanliness;
		LitterBoxCleanliness += i;
		System.out.println(this.name + "'s litterbox has been emptied. Litter box cleanliness value has raised from: "
				+ litterBoxCleanlinessBefore + " to " + LitterBoxCleanliness);
	}

	@Override
	public void waterPets() {
		int initialThirst = thirst;
		thirst -= 30;
		System.out.println(this.name + " has been watered. Thirst score before was: " + initialThirst
				+ ": Thirst after: " + thirst);
	}

	@Override
	public void feedPets() {
		int initialHunger = hunger;
		hunger -= 30;
		System.out.println(
				this.name + " has been fed. Hunger score before was: " + initialHunger + ": hunger after: " + hunger);

	}

	@Override
	public void setThirst(int h) {
		this.thirst = h;

	}

	@Override
	public void walkOrganicPets() {
		int initialBoredom = boredom;
		boredom = -30;
		System.out.println("You have walked: " + this.name + ". " + "The boredom level has dropped from "
				+ initialBoredom + " to " + boredom);

	}

}
