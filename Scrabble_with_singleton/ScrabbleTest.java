 package Scrabble_with_singleton;

import java.util.LinkedList;

public class ScrabbleTest {
	
	public static void main(String[] args) {
		
		Singleton newInstanceOne = Singleton.getInstance();
		
		System.out.println("Instance ID 1: " + System.identityHashCode(newInstanceOne));
		
		System.out.println(newInstanceOne.getLettersList()); 

		LinkedList<String> playedOneTiles =  newInstanceOne.getTiles(7);
		
		System.out.println("Player One tiles: " + playedOneTiles);
		
		System.out.println(newInstanceOne.getLettersList());
		
		Singleton newInstanceTwo = Singleton.getInstance();
		
		System.out.println("Instance ID 2: " + System.identityHashCode(newInstanceTwo));
		
		LinkedList<String> playerTwoTiles = newInstanceTwo.getTiles(10);
		
		System.out.println("Player Two tiles: " + playerTwoTiles);
	
		System.out.println(newInstanceTwo.getLettersList());
	}
	

}
