package Abstract_Factory_Pattern;

public class UFOBossEnemyShipFactory extends EnemyShipFactory{
	public ESWeapon addESGun() {
		return new ESUFOBossGun();
	}
	public ESEngine addEngine() {
		return new ESUFOBossEngine();
	}
}
