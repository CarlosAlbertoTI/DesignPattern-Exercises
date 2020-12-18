package ShipGame_with_factory_method;

public abstract class EnemyShip {
	
	private String name;
	private double amtDamage;
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public double getDamage() {
		return amtDamage;
	}
	
	public void setDamage( double newDamage) {
		this.amtDamage = newDamage;
	}
	
	public void followHeroShip() {
		System.out.println(getName() + " is following the hero");
	}
	
	public void displayHeroShip() {
		System.out.println(getName() + " is on the screen");
	}
	
	public void enemyShipShoots() {
		System.out.println(getName() + " attack and does "+getDamage());
	}
	
}
