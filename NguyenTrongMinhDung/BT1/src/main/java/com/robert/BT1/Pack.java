package com.robert.BT1;

import java.util.Collections;
import java.util.LinkedList;

import com.robert.BT1.CommonCard.Suit;

public class Pack {
	public static final int numberOfCards = 52;
	private static Pack pack = new Pack();
	private static LinkedList<CommonCard> cards;
	
	private Pack(){
		cards = new LinkedList<CommonCard>();
		int cardNumber[] = new int[52];
		int level[] = new int[52];
		Suit suit[] = new Suit[52];
		for (int i = 0; i < numberOfCards; i++){
			if (i>=4){
				level[i] = i-3;
			}
			else{
				level[i] = numberOfCards-3+i;
			}
		}

		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 13; j++)
			{
				suit[i+j*4] = Suit.values()[i];
				cardNumber[i+j*4] = j+2;
			}
		for (int i=0; i<numberOfCards; i++){
			cards.add(new CommonCard(cardNumber[i], suit[i], level[i]));
		}
	}
	
	public static void shufflePack(){
		Collections.shuffle(cards);
	}
	
	public static CommonCard getCardAt(int index){
		return cards.get(index);
	}
	
	public static void printConsole(){
		int i = 0;
		for (CommonCard card : cards){
			System.out.println((i++)+ " " + card.toString() + " " + card.getLevel());
		}
	}
	
	public static CommonCard getFirst(){
		return cards.getFirst();
	}
	
	public static void removeFirst(){
		cards.removeFirst();
	}
	
	public static boolean isEmpty(){
		return cards.isEmpty();
	}
	
	public static Pack getCurrentPack() {
		return Pack.pack;
	}
}
