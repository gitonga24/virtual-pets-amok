package virtualPetAmok;

public class RoboticCat extends Pet implements CatInterface, RoboticPetInterface {

	private int LitterBoxCleanliness = 10;
	private int oilLevel;



	

	public RoboticCat(String name, String description, String demeanor, int boredom, int health) {
		this.name = name;
		this.description = description;
		this.demeanor = demeanor;
		this.boredom = boredom;
		this.health = health;
	}

	@Override
	public int getLitterBoxCleanliness() {
		
		return LitterBoxCleanliness;
	}

	@Override
	public void empyLitterBox(int i) {
		System.out.println(this.name + "'s litterbox has been emptied");
		LitterBoxCleanliness += i;
		
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
	public void oilPet(int oilAmt) {
		System.out.println(name + " has been oiled");
		oilLevel += oilAmt;		
	}


}
