package com.vmt.bt1;

public class MyNumber {
	private int n;
	
	public MyNumber(int n) {
		this.n = n;
	}
	
	public MyNumber(){
		n = 16;
	}
	
	public int tong(){
		int result = 0;
		for (int i = 0; i <= n; i++) result += i;
		System.out.println("number = " + n + " result tong = " + result);
		return result;
	}
	
	public int tich() {
		int result = 1;
		for (int i = 1; i <= n; i++)	result = result*i;
		if (n == 0) result = 0;
		System.out.println("number = " + n + " result tich = " + result);
		return result;
	}
}
