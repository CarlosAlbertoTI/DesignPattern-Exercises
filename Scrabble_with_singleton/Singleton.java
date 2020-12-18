package Scrabble_with_singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {

	private static Singleton firstInstance = null;

	private Singleton() {
	};

	// Holds all my scrabble letters in an array
	String[] scrabbleLetters = { "a", "a", "a", "a", "b", "b", "b", "c", "c", "c", "c", "c", "d", "d", "d", "e", "e",
			"f", "f", "f", "f", "g", "g", "g", "h", "h", "h", "i", "i", "i", "i", "i", "j", "j", "j", "j", "k", "k",
			"k", "l", "l", "l", "l", "l", "m", "m", "m", "m", "n", "n", "n", "o", "o", "o", "o", "o", "o", "p", "p",
			"p", "p", "p", "p", "q", "q", "q", "r", "r", "r", "r", "r", "t", "t", "t", "u", "u", "v", "v", "v", "x",
			"x", "x", "x", "x", "y", "y", "y", "z", "z", "z", "z" };

	private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(scrabbleLetters));

	static boolean firstThread = true;

	public static Singleton getInstance() {
		if (firstInstance == null) {


			firstInstance = new Singleton();
			
			Collections.shuffle(firstInstance.letterList);
		}

		return firstInstance;
	};

	public LinkedList<String> getLettersList() {
		return firstInstance.letterList;
	};

	public LinkedList<String> getTiles(int howManyTiles) {

		LinkedList<String> tilesToSend = new LinkedList<String>();

		for (int i = 0; i < howManyTiles; i++) {
			tilesToSend.add(firstInstance.letterList.remove(0));
		}
		
		return tilesToSend;

	};
}
