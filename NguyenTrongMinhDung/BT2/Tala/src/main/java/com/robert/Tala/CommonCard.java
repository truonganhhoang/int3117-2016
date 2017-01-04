package com.robert.Tala;

public class CommonCard {
	public enum Suit{Spades, Clubs, Diamonds, Hearts};
	private int cardNumber;
	private Suit suit;
	private int level;
	private boolean chose;
	
	public CommonCard(int cardNumber, Suit suit, int level){
		this.cardNumber = cardNumber;
		this.suit = suit;
		this.level = level;
	}
	
	public CommonCard(int cardNumber, Suit suit) {
		this.cardNumber = cardNumber;
		this.suit = suit;
	}
	
	@Override
	public CommonCard clone(){
		return new CommonCard(cardNumber, suit, level);
	}
	
	public int getCardNumber() {
		return Integer.valueOf(cardNumber);
	}
	
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public String getSuitName() {
		return suit.name();
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
	public int getLevel() {
		return Integer.valueOf(level);
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public boolean beChosen(){
		return chose;
	}
	
	public void notBeChosen(){
		chose = false;
	}
	
	public void setToBeChosen(boolean value){
		chose = value;
	}
	
	@Override
	public String toString(){
		String nameOfCardNumber = "";
		String nameOfSuit = null;
		
		if (cardNumber < 10) {
			char[] c = new char[1]; 
			c[0] = (char)(cardNumber + 48);
			nameOfCardNumber = new String(c);
		}
		else
			if (cardNumber > 10)
				switch(cardNumber){
					case 11:
						nameOfCardNumber = "J";
						break;
					case 12:
						nameOfCardNumber = "Q";
						break;
					case 13:
						nameOfCardNumber = "K";
						break;
					case 14:
						nameOfCardNumber = "A";
						break;
					default:
						break;
				}
			else
				nameOfCardNumber = "10";
		
		switch(suit){
			case Spades:
				nameOfSuit = "Bich";
				break;
			case Clubs:
				nameOfSuit = "Nhep";
				break;
			case Diamonds:
				nameOfSuit = "Ro";
				break;
			case Hearts:
				nameOfSuit = "Co";
				break;
		}
		return (level > 0) ? nameOfCardNumber + " " + nameOfSuit : "Joker";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		
		if (obj instanceof CommonCard) {
			CommonCard otherCard = (CommonCard)obj;
			
			return otherCard.cardNumber == this.cardNumber && otherCard.suit == this.suit;
		}
		else
			return false;
	}
}
