package com.vmt.bt1;

public class MyNumber {
	private int n;
	
	public MyNumber(int n) {
		this.n = n;
	}
	
	public MyNumber(){
		n = 100;
	}
	
	public int tong(){
		int result = 0;
		for (int i = 0; i < n; i++) result += i;
		return result;
	}
	
	public int tich() {
		int result = 1;
		for (int i = 0; i < n; i++) result *= i;
		return result;
	}
}
