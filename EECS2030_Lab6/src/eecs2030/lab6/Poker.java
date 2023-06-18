package eecs2030.lab6;

import java.util.HashMap;
import java.util.Map;

/**
 * This class implements poker game-related methods
 * @author 
 *
 */
public class Poker {
	private Poker(){};

	/**
	 * Checks if a hand contains a Three of a kind: https://en.wikipedia.org/wiki/List_of_poker_hands#Three_of_a_kind
	 * @param hand
	 * @return true if the hand contains three cards of one rank and two cards of two other ranks 
	 * NOTE: Four of a kind is excluded, https://en.wikipedia.org/wiki/List_of_poker_hands#Four_of_a_kind; 
	 * so is Full House: three cards of one rank and two cards of another rank)
	 * 
	 */
	public static boolean hasThreeOfAKind(PokerHand hand){
		//TODO
		Map<CardValue,Integer> map = new HashMap<>();
		for (Card card: hand) {
			if(map.containsKey(card.getCardValue())) {
				map.put(card.getCardValue(), map.get(card.getCardValue())+1);
			
			}
			else map.put(card.getCardValue(), 1);
		}
		int num = 0;
		for (CardValue key : map.keySet()) {
			if(map.get(key)==3) num++;
			if(num == 1) return true;
		}
		return false;
	}

	/**
	 * Checks if a hand contains a Flush: https://en.wikipedia.org/wiki/List_of_poker_hands#Flush
	 * @param hand
	 * @return true if the hand contains five cards all of the same suit, not all of sequential rank
	 * NOTE: Straight flush https://en.wikipedia.org/wiki/List_of_poker_hands#Straight_flush  
	 * are to be excluded
	 */
	public static boolean hasFlush(PokerHand hand){
		//TODO
		Map<CardSuit,Integer> map = new HashMap<>();
		for (Card card: hand) {
			if(map.containsKey(card.getSuit())) {
				map.put(card.getSuit(), map.get(card.getSuit())+1);
			
			}
			else map.put(card.getSuit(), 1);
		}
		int num = 0;
		for (CardSuit key : map.keySet()) {
			if(map.get(key)==5) num++;
			if(num == 1) return true;
		}
		return false;
	}

}
