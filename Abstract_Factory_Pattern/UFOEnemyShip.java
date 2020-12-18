package Abstract_Factory_Pattern;

public class UFOEnemyShip extends EnemyShip{
	EnemyShipFactory enemyShipFactory;
	
	
	public UFOEnemyShip(EnemyShipFactory shipFactory) {
		this.enemyShipFactory = shipFactory;
	}
	
	void makeShip() {
        System.out.println("Making enemy ship " + getName());
        weapon = enemyShipFactory.addESGun();
        engine = enemyShipFactory.addESEngine();

	}
}
