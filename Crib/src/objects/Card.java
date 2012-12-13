package objects;

public class Card {

	private Suit suit;
	private int number;
	
	public Card(Suit suit, int number) {
		this.suit = suit;
		this.number = number;
	}
	
	public Suit getSuit() {
		return suit;
	}
	public int getNumber() {
		return number;
	}
	
	public int getValue() {
		if (number > 10){
			return 10;
		} 
		return number;
	}
	
	public String toString() {
		String result = "";
		switch (number){
			case 1: result = "Ace of "; 
			break;
			case 2: result = "Two of "; 
			break;
			case 3: result = "Three of "; 
			break;
			case 4: result = "Four of "; 
			break;
			case 5: result = "Five of "; 
			break;
			case 6: result = "Six of "; 
			break;
			case 7: result = "Seven of "; 
			break;
			case 8: result = "Eight of "; 
			break;
			case 9: result = "Nine of "; 
			break;
			case 10: result = "Ten of "; 
			break;
			case 11: result = "Jack of "; 
			break;
			case 12: result = "Queen of "; 
			break;
			case 13: result = "King of "; 
			break;
		}
		switch(suit){
			case SPADES: result = result.concat("Spades");
			break;
			case HEARTS: result = result.concat("Hearts");
			break;
			case CLUBS: result = result.concat("Clubs");
			break;
			case DIAMONDS: result = result.concat("Diamonds");
			break;
		}
		return result;
	}
	
	public static Card generateCard(int num){
		int value = (num % 13) + 1;
		int suitNum = num / 13;
		Suit suit;
		switch (suitNum){
		case 0:
			suit = Suit.SPADES;
			break;
		case 1:
			suit = Suit.HEARTS;
			break;
		case 2:
			suit = Suit.CLUBS;
			break;
		case 3:
			suit = Suit.DIAMONDS;
			break;
		default:
			System.out.println("ERROR");
			return null; 
		}
	
		return new Card(suit, value);
	}
}
