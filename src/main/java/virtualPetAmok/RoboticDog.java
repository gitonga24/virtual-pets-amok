package virtualPetAmok;

public class RoboticDog extends Pet implements DogInterface, RoboticPetInterface {

	private int oilLevel;
	private int CageCleanliness;

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
		System.out.println(name + " has been oiled");
		oilLevel += oilAmt;
		
	}

	
	@Override
	public int getCageCleanliness() {
		return CageCleanliness;
	}

	@Override
	public void cleanCage(int cleanValue) {
		System.out.println(this.name +"'s cage has been cleaned.");
		CageCleanliness += cleanValue;

	}


	@Override
	public void walkDog() {
		System.out.println(this.name + " dog is walking");
		
	}

}
