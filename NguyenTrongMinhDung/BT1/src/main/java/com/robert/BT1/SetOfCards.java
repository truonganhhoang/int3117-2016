package com.robert.BT1;

import java.util.ArrayList;
import java.util.Collections;

public class SetOfCards implements CardActivity {
	public enum Type{kxd, doi, ba, tu_quy, day, bo_thong};
	private ArrayList<CommonCard> Cards;
	
	public SetOfCards(){
		Cards = new ArrayList<CommonCard>();
	}
	
	protected boolean similarCardNumber(){
		if (Cards.size() <= 4 && Cards.size() > 1){
			for (int i=0; i<Cards.size()-1; i++){
				if (Cards.get(i).getCardNumber() != Cards.get(i+1).getCardNumber())
					return false;
			}
			return true;
		}
		else
			return false;
	}
	
	protected boolean continousCardNumber(){
		sortCards();
		if (Cards.size() >= 3){
			if (Cards.get(Cards.size()-1).getCardNumber() == 2){
				if (Cards.get(Cards.size()-2).getCardNumber() == 14){
					for (int i=0; i < Cards.size()-2; i++)
						if (Cards.get(i).getCardNumber() + 1 != Cards.get(i+1).getCardNumber())
							return false;
					return true;
				}	
				else
					return false;
			}
			else
				for (int i=0; i < Cards.size()-1; i++)
					if (Cards.get(i).getCardNumber() + 1 != Cards.get(i+1).getCardNumber())
						return false;
			return true;
		}
		else
			return false;
	}
	
	protected boolean continousThreePairs(){
		sortCards();
		if (Cards.size() == 6){
			for (int i=0; i<Cards.size()-2; i+=2)
				if (Cards.get(i).getCardNumber() != Cards.get(i+1).getCardNumber())
					return false;
			if (Cards.get(4).getCardNumber() == 2)
				return (Cards.get(3).getCardNumber() == 14 && Cards.get(1).getCardNumber() == 13);
			else{
				for (int i=1; i<Cards.size()-2; i+=2)
					if (Cards.get(i).getCardNumber() + 1 != Cards.get(i+2).getCardNumber())
						return false;
				return true;
			}
		}
		else
			return false;
	}
	
	protected boolean legalCards(){
		return (Cards.size() == 1 || similarCardNumber() || continousCardNumber() || continousThreePairs());
	}
	
	protected Type typeOfLegalCards(){
		if (similarCardNumber())
			switch(Cards.size()){
				case 2:
					return Type.doi;
				case 3:
					return Type.ba;
				case 4:
					return Type.tu_quy;
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
		return Type.kxd;
	}
	
	public boolean isStrongerThan(SetOfCards other){
		if (legalCards()){
			if (other.isEmpty())
				return true;
			if (other.numberOfCards() == numberOfCards()){
				if (other.typeOfLegalCards() == typeOfLegalCards())
					return (Cards.get(Cards.size()-1).getLevel() > other.getCardAt(other.numberOfCards()-1).getLevel());
				else
					return false;
			}
			else{
				if (other.Cards.size() == 1){
					if (other.Cards.get(other.Cards.size()-1).getCardNumber() == 2)
						return (typeOfLegalCards() == Type.tu_quy || typeOfLegalCards() == Type.bo_thong ||
							(typeOfLegalCards() == Type.day && numberOfCards() >= 5));
					else
						return false;
				}
				else
					return (other.getCardAt(other.Cards.size()-1).getLevel() < Cards.get(Cards.size() - 1).getLevel());
			}
		}
		else
			return false;
	}
	
	public boolean isEmpty(){
		return (Cards.size() == 0);
	}
	
	public void addCard(CommonCard card) {
		Cards.add(card);
	}
	
	public void setCard(int index, CommonCard card) {
		Cards.set(index, card);
	}
	
	public CommonCard getCardAt(int index) {
		return Cards.get(index);
	}
	
	public void sortCards() {
		Cards = SetOfCards.sortCardsByLevel(Cards);
	}
	
	public void removeAt(int index) {
		Cards.remove(index);
	}
	
	public ArrayList<CommonCard> getCards(){
		return Cards;
	}
	
	public int numberOfCards(){
		return Cards.size();
	}
	
	public void removeAll(){
		for (int i = 0; i < Cards.size();)
			Cards.remove(i);
	}
	
	public void printConsole(){
		int i = 0;
		for (CommonCard card : Cards){
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
