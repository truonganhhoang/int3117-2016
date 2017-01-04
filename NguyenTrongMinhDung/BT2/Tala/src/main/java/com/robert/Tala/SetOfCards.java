package com.robert.Tala;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SetOfCards implements CardActivity {
	public enum Type {Undefined, Single, Double, Triple, Quadra, Continous, SpecialContinous};
	private List<CommonCard> cards;
	
	public SetOfCards(){
		cards = new ArrayList();
	}
	
	protected boolean similarCardNumber(){
		if (cards.size() <= 4 && cards.size() > 1){
			for (int i=0; i<cards.size()-1; i++){
				if (cards.get(i).getCardNumber() != cards.get(i+1).getCardNumber()) {
					return false;
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
	
	protected boolean continousCardNumber(){
		sortCards();
		
		if (cards.size() < 3){
			return false;
		}
		
		if (cards.get(cards.size()-1).getCardNumber() == 2){
			if (cards.get(cards.size()-2).getCardNumber() != 14){
				return false;
			}
			for (int i=0; i < cards.size()-2; i++) {
				if (cards.get(i).getCardNumber() + 1 != cards.get(i+1).getCardNumber()) {
					return false;
				}
			}
			return true;
		}
		else {
			for (int i=0; i < cards.size()-1; i++) {
				if (cards.get(i).getCardNumber() + 1 != cards.get(i+1).getCardNumber()) {
					return false;
				}
			}
		}
		return true;
	}
	
	protected boolean continousThreePairs(){
		sortCards();
		if (cards.size() != 6){
			return false;
		}
		for (int i=0; i<cards.size()-2; i+=2) {
			if (cards.get(i).getCardNumber() != cards.get(i+1).getCardNumber()) {
				return false;
			}
		}
		
		if (cards.get(4).getCardNumber() == 2) {
			return cards.get(3).getCardNumber() == 14 && cards.get(1).getCardNumber() == 13;
		}
		
		for (int i=1; i<cards.size()-2; i+=2) {
			if (cards.get(i).getCardNumber() + 1 != cards.get(i+2).getCardNumber()) {
				return false;
			}
		}
		
		return true;
	}
	
	protected boolean legalCards(){
		return typeOfLegalCards() != Type.Undefined;
	}
	
	protected Type typeOfLegalCards() {
		if (cards.size() == 1) {
			return Type.Single;
		}
		else {
			if (similarCardNumber())
				switch(cards.size()){
					case 2:
						return Type.Double;
					case 3:
						return Type.Triple;
					case 4:
						return Type.Quadra;
					default:
						return Type.Undefined;
				}
			else{
				if (continousCardNumber()) {
					return Type.Continous;
				}
				
				if (continousThreePairs()) {
					return Type.SpecialContinous;
				}
				else {
					return Type.Undefined;
				}
			}
		}
	}
	
	public boolean isStrongerThan(SetOfCards other){
		if (other.isEmpty()) {
			return true;
		}
		
		if (legalCards()){
			return false;
		}
		
		Type currentType = typeOfLegalCards();
		
		if (other.numberOfCards() == numberOfCards()){
			return other.typeOfLegalCards() == currentType && cards.get(cards.size()-1).getLevel() > other.getCardAt(other.numberOfCards()-1).getLevel();
		}
		
		if (other.cards.size() == 1){
			if (other.cards.get(other.cards.size()-1).getCardNumber() == 2) {
				return currentType == Type.Quadra || currentType == Type.SpecialContinous ||
					(currentType == Type.Continous && numberOfCards() >= 5);
			}
			else {
				return false;
			}
		}
		else {
			return other.getCardAt(other.cards.size()-1).getLevel() < cards.get(cards.size() - 1).getLevel() && other.typeOfLegalCards() == currentType;
		}
	}
	
	@Override
	public boolean isEmpty(){
		return cards.isEmpty();
	}
	
	@Override
	public void addCard(CommonCard card) {
		cards.add(card);
	}
	
	@Override
	public void setCard(int index, CommonCard card) {
		cards.set(index, card);
	}
	
	@Override
	public CommonCard getCardAt(int index) {
		return cards.get(index);
	}
	
	@Override
	public void sortCards() {
		cards = SetOfCards.sortCardsByLevel(cards);
	}
	
	@Override
	public void removeAt(int index) {
		cards.remove(index);
	}
	
	public List<CommonCard> getCards(){
		return cards;
	}
	
	public int numberOfCards(){
		return cards.size();
	}
	
	public void removeAll(){
		cards = new ArrayList();
	}
	
	public void printConsole(){
		int i = 0;
		for (CommonCard card : cards){
			System.out.println((i++) + " " + card.toString() + " " + card.getLevel());
		}
	}
	
	public static List<CommonCard> sortCardsByLevel(List<CommonCard> cards){
		int min;
		int posmin;
		
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
