package virtualPetAmok;

public class RoboticCat extends Pet implements CatInterface, RoboticPetInterface {

	private int LitterBoxCleanliness = 10;
	private int oilLevel;

	//public RoboticCat(String string, String string2, String string3, int health, int j, int k, int l) {
		// TODO Auto-generated constructor stub
	//}

	

	@Override
	public int getLitterBoxCleanliness() {
		
		return LitterBoxCleanliness;
	}

	@Override
	public void empyLitterBox(int i) {
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
		oilLevel += oilAmt;		
	}


}
