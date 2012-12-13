package objects;

import java.util.ArrayList;

public class Hand {
	private ArrayList<Card> hand;
	
	public Hand(Deck deck, int numCards) {
		hand = new ArrayList<Card>();
		this.addCards(deck, numCards);
	}
	public Hand(){
		hand = new ArrayList<Card>();
	}
	
	public void addCard(Card card){
		hand.add(card);
	}
	public void addCards(Deck deck, int numCards){
		for (int i = 0; i < numCards; i++) {
			hand.add(deck.deal());
		}
	}
	
	public int size() {
		return hand.size();
	}
	
	public Card discard(int index){
		return hand.remove(index);
	}
	
	public String toString() {
		String theString = "";
		for (int i = 0; i < hand.size(); i++){
			theString += (i+1) + ": [" + hand.get(i) + "]  ";
		}
		return theString;
	}
	
	public int countHand(Card theCut){
		hand.add(theCut);
		return 0;
	}

}
