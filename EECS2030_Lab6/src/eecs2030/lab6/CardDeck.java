package eecs2030.lab6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/** 
 * Implements a deck of 52 cards, e.g., for a poker game
 * @author 
 *
 */
public class CardDeck implements Iterable <Card>{
	/**
	 * Creates a new deck of cards. The deck will contain 52 distinct cards.
	 * the deck may or may not be shuffled
	 */
	private List<Card> carddeck;
	public CardDeck ()
	{
		this.carddeck = new ArrayList<>();
		for(int i =0;i< CardSuit.values().length;i++)
			for(int j =0;j<CardValue.values().length;j++) {
				Card card = new Card(CardValue.values()[j],CardSuit.values()[i]);
				this.carddeck.add(card);
			}
	}

	/**
	 * Shuffles the deck
	 */
	public void shuffle(){
		//TODO
		Collections.shuffle(carddeck);
	}

	/**
	 * returns a collection of 5 cards taken from the top of deck.
	 * After the operation those 5 cards should be removed from the deck
	 * and its size is decreased by 5.
	 * @return a collection of 5 cards taken from the top of deck
	 */
	public Collection<Card> draw5Cards (){
		//TODO
		Collection<Card> drawcards = new ArrayList<Card>(this.carddeck.subList(this.carddeck.size()-5, this.carddeck.size()));
		this.carddeck.removeAll(drawcards);
		return drawcards;
	}

	/**  
	 * After the operation this card should be removed from the deck
	 * and its size is decreased by 1.
	 * @return a card from the top of the deck
	 */
	public Card drawCard (){
		//TODO
		Card card = this.carddeck.remove(this.carddeck.size()-1);
		return card;
	}

	/**
	 * @return current deck size, a value between 0 and 52 inclusive
	 */
	public int size(){
		//TODO
		return this.carddeck.size();
	}

	@Override
	public String toString (){
		//TODO
		return carddeck.toString();
	}

	@Override
	public Iterator <Card> iterator() {
		//TODO
		return carddeck.iterator();
	}

}
