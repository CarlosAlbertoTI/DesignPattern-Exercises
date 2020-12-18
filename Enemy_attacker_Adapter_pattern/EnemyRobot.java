package Enemy_attacker_Adapter_pattern;
import java.util.Random;

public class EnemyRobot {

	
	Random generatoRandom = new Random();
	
	public void smashWithHands() {
		
		int attackDamage =generatoRandom.nextInt(10) + 1;
		System.out.println("Enemy robot does "+attackDamage+" Damage");
	}
	
	public void walkForward() {
		
		int movement = generatoRandom.nextInt(5) + 1;
		System.out.println("Enemy robot walks forward "+movement+" spaces");
	}
	
	public void reactToHuman(String driverName) {
		System.out.println("Enemy robot tramps on "+driverName);
	}
}
