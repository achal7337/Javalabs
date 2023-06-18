package eecs2030.lab6;

public enum CardSuit {
	HEARTS(1), DIAMONDS(2),SPADES(3),CLUBS(4);
	private int value;
	private CardSuit(int value) {
		this.value = value;
	}
	public int getCardSuit() {
		return value;
	}
}
