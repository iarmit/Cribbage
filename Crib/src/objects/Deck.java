package objects;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> theDeck;
	
	public Deck() {
		theDeck = new ArrayList<Card>();
		for (int i = 0; i < 52; i ++){
			theDeck.add(Card.generateCard(i));
		}
		
	}
	
	public void shuffle() {
		Collections.shuffle(theDeck);
	}
	
	public String toString() {
		String theString = "Deck Size: " + theDeck.size() + "\n";
		for (int i = 0; i < theDeck.size(); i++){
			theString += "[ " + theDeck.get(i) + " ]\n";
		}
		return theString;
	}
	//Deals the top card from the deck
	public Card deal() {
		return theDeck.remove(0);
	}
}
