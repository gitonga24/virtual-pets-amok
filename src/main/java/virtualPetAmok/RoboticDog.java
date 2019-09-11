package virtualPetAmok;

public class RoboticDog extends Pet implements DogInterface, RoboticPetInterface {

	private int oilLevel;
	private int CageCleanliness;

	public RoboticDog() {
		// TODO Auto-generated constructor stub
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

	
	@Override
	public int getCageCleanliness() {
		// TODO Auto-generated method stub
		return CageCleanliness;
	}

	@Override
	public void cleanCage(int cleanValue) {
		CageCleanliness += cleanValue;

	}

}
