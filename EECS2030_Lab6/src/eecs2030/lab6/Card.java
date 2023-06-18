package eecs2030.lab6;

/**
 * This class implements a playing card with one of 52 possible values.
 * @author 
 */
public class Card {
	/**
	 * Creates a new card with the specified Value (Rank) and Suit
	 * @param cardValue rank
	 * @param suit card suit
	 */
	private CardValue cardvalue;
	private CardSuit suit;
	
	public Card (CardValue cardValue, CardSuit suit)
	{
		this.cardvalue = cardValue;
		this.suit = suit;
	}

	/**
	 * @return card value (rank)
	 */
	public CardValue getCardValue()
	{
		//TODO
		return cardvalue;
	}

	/**
	 * @return card suit
	 */
	public CardSuit getSuit()
	{
		//TODO
		return suit;
	}

	@Override
	public String toString(){
		//TODO
		return this.cardvalue+" "+this.suit;
	}
}
