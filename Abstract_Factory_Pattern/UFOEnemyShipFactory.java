package Abstract_Factory_Pattern;

public class UFOEnemyShipFactory extends EnemyShipFactory{
	public ESWeapon addESGun() {
		return new ESUFOWeapon();
	}
	public ESEngine addEngine() {
		return new ESUFOEngine();
	}
}
