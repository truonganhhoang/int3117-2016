package com.t3h.NamNhuan;

import java.util.Scanner;

public class NamNhuan {
	public String kiemTra(int year){
		if((year%4 == 0 && year%100 != 0)|| year%400 == 0){
			return "Nam nhuan";
		}
		return "Khong phai nam nhuan";
	}
	
	public void Nhap(){
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap nam kiem tra");
		boolean flag = false;
		while(!flag){
			int year = input.nextInt();
			if(year <= 0){
				System.out.println("Nam khong hop le, nhap lai!");
				continue;
			}
			else{
				flag = true;
				System.out.println(kiemTra(year));
			}
		}
		input.close();
	}

	public static void main(String[] args) {
		NamNhuan year = new NamNhuan();
		year.Nhap();
	}

}
