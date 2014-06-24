package demo;


/**
 * Class that demos the shuffle and deal methods on the Deck
 * @author Reshma G Bidikar
 *
 */
public class CardsApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Create a new deck of cards
		Deck deck = new Deck();
		//Shuffle the cards
		deck.shuffle();
		System.out.println("Shuffled deck-----------------------------");
		//Print all the cards in the deck
		for(Card card:deck.getCards()){
			System.out.println(card);
		}
		System.out.println("finished printing-----------------------");
		//Deal a card from the deck
		Card card = deck.dealCard();
		//Print the card
		System.out.println("Dealt card is "+card);
		

	}

}
