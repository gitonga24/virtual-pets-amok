package virtualPetAmok;

public class RoboticDog extends Pet implements DogInterface, RoboticPetInterface {

	private int oilLevel = 0;
	private int cageCleanliness;

	public RoboticDog(String name, String description, String demeanor, int boredom, int health) {
		this.boredom = boredom;
		this.demeanor = demeanor;
		this.name = name;
		this.description = description;
		this.health = health;
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
	public void oilPet(int oilAmt) {
		int oilLevelBefore = oilLevel;
		oilLevel += oilAmt;
		
		System.out.println(
				name + " has been oiled. The oil level has raised from: " + oilLevelBefore + " to " + oilLevel + ".");
	}

	@Override
	public int getCageCleanliness() {
		return cageCleanliness;
	}

	@Override
	public void cleanCage() {
		int afterCleanlinessValue = cageCleanliness + 50;
		System.out.println(this.name + "'s cage has been cleaned. Cleanliness value has raised from " + cageCleanliness
				+ " to " + afterCleanlinessValue);

	}

	@Override
	public void walkDog() {
		System.out.println(this.name + " dog is walking");

	}

	@Override
	public void setCageCleanliness(int cc) {
		this.cageCleanliness = cc;

	}

}
