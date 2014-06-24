package demo;

/**
 * Class that represents a card in a deck
 * @author Reshma G Bidikar
 *
 */
public class Card {
	
	/**
	 * Suit of the card
	 */
	Suit suit;
	/**
	 * Number of the card
	 */
	Number number;
	
	public Card(Suit suit, Number number){
		this.suit=suit;
		this.number=number;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
		this.number = number;
	}
	
	public String toString(){
		return this.number+" of "+this.suit;
		
	}

}


