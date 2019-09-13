package virtualPetAmok;

public class RoboticCat extends Pet implements CatInterface, RoboticPetInterface {

	private int LitterBoxCleanliness = 10;
	private int oilLevel;

	@Override
	public int getLitterBoxCleanliness() {
		return LitterBoxCleanliness;
	}

	public RoboticCat(String name, String description, String demeanor, int boredom, int health) {
		this.name = name;
		this.description = description;
		this.demeanor = demeanor;
		this.boredom = boredom;
		this.health = health;
	}

	public void setLitterBoxCleanliness(int i) {
		LitterBoxCleanliness = i;
	}

	public void setHealth(int i) {
		health = i;
	}

	@Override
	public void setOilLevel(int oilLevel) {
		this.oilLevel = oilLevel;
	}

	@Override
	public int getOilLevel() {
		return oilLevel;
	}

	@Override
	public void empyLitterBox(int i) {
		int litterBoxCleanlinessBefore = LitterBoxCleanliness + i;
		System.out.println(this.name + "'s litterbox has been emptied. Litter box cleanliness value has raised from: "
				+ LitterBoxCleanliness + " to " + litterBoxCleanlinessBefore);
	}

	@Override
	public void oilPet(int oilAmt) {
		int oilLevelAfter = oilLevel + oilAmt;
		System.out.println(
				name + " has been oiled. The oil level has raised from: " + oilLevel + " to " + oilLevelAfter + ".");
	}

}
