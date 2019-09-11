package virtualPetAmok;

public abstract class Pet {

	protected int boredom;
	protected String demeanor;
	protected String name;
	protected String description;
	protected int health;

	public Pet() {
		super();
	}

	public String getMake() {
		return demeanor;
	}
	
	public void setMake(String make) {
		this.demeanor = make;
	}
	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	

	public String getDescription() {
		return description;
	}

	public void setDescription (String description) {
		this.description = description;
	}
	
	
	public int getBoredom() {
		return boredom;
	}

	public void setBoredom(int boredom) {
		this.boredom = boredom;
	}

	public int getHealth() {	
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	
	public void play() {
		boredom -= 15;
		health += 5;
	}
}