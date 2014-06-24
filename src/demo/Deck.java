package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class that represents a deck of cards.
 * 
 * @author Reshma G Bidikar
 *
 */
public class Deck {
	
	/**
	 * List of cards in the deck
	 */
	List<Card> cards;
	
	/**
	 * Maintains the current card index. Used while dealing card
	 */
	int currentCardIndex = -1;
	
	/**
	 * This method initializes the deck to all the cards
	 */
	private void initializeDeck(){
		
		cards = new ArrayList<Card>();
		//Initialize the Deck
		Card card;
		for(Suit suit: Suit.values()){
			for(Number number:Number.values()){
				card = new Card(suit,number);
				cards.add(card);
			}
		}
	}
	
	/**
	 * Default constructor, creates and initializes the deck if not already created
	 */
	public Deck(){
		if(cards == null)
			initializeDeck();
	}
	
	
	/**
	 * Returns all the cards in the deck.
	 * @return
	 */
	public List<Card> getCards() {
		return cards;
	}
	
	/**
	 * Shuffles the cards in the deck
	 */
	public void shuffle(){
		
		Collections.shuffle(cards);
		
	}
	
	/**
	 * If all the cards have bean dealt, throws an Exception. Otherwise deals the top card in the deck.
	 * @return
	 */
	public Card dealCard(){
		if(currentCardIndex == cards.size()){
			throw new RuntimeException("All cards dealt");
		}
		currentCardIndex ++;
		return cards.get(currentCardIndex);
	}

}
