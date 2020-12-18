package ShipGame_with_factory_method;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String [] args) {
		
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		
		EnemyShip theEnemy = null;
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What type ship? (U / R / B)?");
		
		if(userInput.hasNextLine()) {
			String typeOfShip= userInput.nextLine();
			
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
		}
		
		if (theEnemy != null) {			
			doStuffEnemy(theEnemy);
		}
		 
	}
	
	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		
		anEnemyShip.displayHeroShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
	
}
