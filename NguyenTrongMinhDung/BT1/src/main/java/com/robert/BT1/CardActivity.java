package com.robert.BT1;

public interface CardActivity {
	public void addCard(CommonCard card);
	public void setCard(int index, CommonCard card);
	public CommonCard getCardAt(int index);
	public void sortCards();
	public boolean isEmpty();
	public void removeAt(int index);
}
