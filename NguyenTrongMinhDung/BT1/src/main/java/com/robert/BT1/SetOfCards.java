package com.robert.BT1;

import java.util.ArrayList;
import java.util.Collections;

public class SetOfCards implements CardActivity {
	public enum Type{kxd, don_le, doi, ba, tu_quy, day, bo_thong};
	private ArrayList<CommonCard> cards;
	
	public SetOfCards(){
		cards = new ArrayList<CommonCard>();
	}
	
	protected boolean similarCardNumber(){
		if (cards.size() <= 4 && cards.size() > 1){
			for (int i=0; i<cards.size()-1; i++){
				if (cards.get(i).getCardNumber() != cards.get(i+1).getCardNumber())
					return false;
			}
			return true;
		}
		else
			return false;
	}
	
	protected boolean continousCardNumber(){
		sortCards();
		
		if (cards.size() >= 3){
			if (cards.get(cards.size()-1).getCardNumber() == 2){
				if (cards.get(cards.size()-2).getCardNumber() == 14){
					for (int i=0; i < cards.size()-2; i++)
						if (cards.get(i).getCardNumber() + 1 != cards.get(i+1).getCardNumber())
							return false;
					return true;
				}	
				else
					return false;
			}
			else
				for (int i=0; i < cards.size()-1; i++)
					if (cards.get(i).getCardNumber() + 1 != cards.get(i+1).getCardNumber())
						return false;
			return true;
		}
		else
			return false;
	}
	
	protected boolean continousThreePairs(){
		sortCards();
		if (cards.size() == 6){
			for (int i=0; i<cards.size()-2; i+=2)
				if (cards.get(i).getCardNumber() != cards.get(i+1).getCardNumber())
					return false;
			if (cards.get(4).getCardNumber() == 2)
				return (cards.get(3).getCardNumber() == 14 && cards.get(1).getCardNumber() == 13);
			else{
				for (int i=1; i<cards.size()-2; i+=2)
					if (cards.get(i).getCardNumber() + 1 != cards.get(i+2).getCardNumber())
						return false;
				return true;
			}
		}
		else
			return false;
	}
	
	protected boolean legalCards(){
		return typeOfLegalCards() != Type.kxd;
	}
	
	protected Type typeOfLegalCards() {
		if (cards.size() == 1)
			return Type.don_le;
		else {
			if (similarCardNumber())
				switch(cards.size()){
					case 2:
						return Type.doi;
					case 3:
						return Type.ba;
					case 4:
						return Type.tu_quy;
					default:
						return Type.kxd;
				}
			else{
				if (continousCardNumber())
					return Type.day;
				else{
					if (continousThreePairs())
						return Type.bo_thong;
					else
						return Type.kxd;
				}
			}
		}
	}
	
	public boolean isStrongerThan(SetOfCards other){		
		if (legalCards()){
			if (other.isEmpty())
				return true;
			
			Type currentType = typeOfLegalCards();
			
			if (other.numberOfCards() == numberOfCards()){
				if (other.typeOfLegalCards() == currentType)
					return (cards.get(cards.size()-1).getLevel() > other.getCardAt(other.numberOfCards()-1).getLevel());
				else
					return false;
			}
			else{
				if (other.cards.size() == 1){
					if (other.cards.get(other.cards.size()-1).getCardNumber() == 2)
						return (currentType == Type.tu_quy || currentType == Type.bo_thong ||
							(currentType == Type.day && numberOfCards() >= 5));
					else
						return false;
				}
				else
					return (other.getCardAt(other.cards.size()-1).getLevel() < cards.get(cards.size() - 1).getLevel() && other.typeOfLegalCards() == currentType);
			}
		}
		else
			return false;
	}
	
	public boolean isEmpty(){
		return (cards.size() == 0);
	}
	
	public void addCard(CommonCard card) {
		cards.add(card);
	}
	
	public void setCard(int index, CommonCard card) {
		cards.set(index, card);
	}
	
	public CommonCard getCardAt(int index) {
		return cards.get(index);
	}
	
	public void sortCards() {
		cards = SetOfCards.sortCardsByLevel(cards);
	}
	
	public void removeAt(int index) {
		cards.remove(index);
	}
	
	public ArrayList<CommonCard> getCards(){
		return cards;
	}
	
	public int numberOfCards(){
		return cards.size();
	}
	
	public void removeAll(){
		cards = new ArrayList<CommonCard>();
	}
	
	public void printConsole(){
		int i = 0;
		for (CommonCard card : cards){
			System.out.println((i++) + " " + card.toString() + " " + card.getLevel());
		}
	}
	
	public static ArrayList<CommonCard> sortCardsByLevel(ArrayList<CommonCard> cards){
		int min, posmin;
		
		for (int i=0; i < cards.size(); i++){
			min = cards.get(i).getLevel();
			posmin = i;
			for (int j=i; j < cards.size(); j++){
				if (min > cards.get(j).getLevel()){
					min = cards.get(j).getLevel();
					posmin = j;
				}
			}
			Collections.swap(cards, i, posmin);
		}
		return cards;
	}
}
