package virtualpet;

public class TestPet {
	
	String name;
	String favFood;
	int weight;
	int height;
	int legs = 4;
	
	public TestPet (String name, String favFood, int weight, int height) {
		
		this.name = name;
		this.favFood = favFood;
		this.weight = weight;
		this.height = height;
	}
		public void AssignHeight (int testPetHeight ) {
			height = testPetHeight;	
			
		}
		
	}

