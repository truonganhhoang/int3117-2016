package com.vmt.bt1;

public class Main {
	public static void main(String [] args){
		System.out.println("giai phuong trinh bac hai\n");
		double a = 0;
		double b = 0;
		double c = 1;
		System.out.println(a+"*x^2 + " + b + "*x + " + c + " = 0\n");
		PhuongTrinhBacHai ptBacHai = new PhuongTrinhBacHai(a, b, c);
		String result = ptBacHai.getResult();
		System.out.println("\n" + result);
	}
}
