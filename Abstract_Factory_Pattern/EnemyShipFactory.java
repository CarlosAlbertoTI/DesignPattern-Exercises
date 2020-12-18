package Abstract_Factory_Pattern;

public abstract class EnemyShipFactory {
	public ESWeapon addESGun() {
		return new ESUFOWeapon();
	}
	public ESEngine addESEngine() {
		return new ESUFOEngine();
	}
}