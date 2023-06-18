package eecs2030.lab6;

public class CardDemo {

	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		deck.shuffle();
		//System.out.println(deck);
		
		System.out.println("Drawing one card: " + deck.drawCard());
		System.out.println("Deck size before drawing 5: " + deck.size());
		PokerHand hand = new PokerHand(deck.draw5Cards());
		System.out.println("Deck size  after drawing 5: " + deck.size());
		System.out.println(hand);
		
		System.out.println("Has a Flush: " + Poker.hasFlush(hand));
		
		System.out.println();
		
		System.out.println("Searching for Three of a kind");
		int threeOfkindFound = 0;
		for (int i = 0; i < 100; i++){
			deck = new CardDeck();
			deck.shuffle();
			hand = new PokerHand(deck.draw5Cards());
			if (Poker.hasThreeOfAKind(hand)){
				threeOfkindFound++;
				System.out.println("Three of a kind found: " + hand);
			}
		}
		System.out.println("Total three of a kind found: " + threeOfkindFound);
	}
}
