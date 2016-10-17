package main;

import java.util.Scanner;

//tam giac
public class Triange {
	private double first;//canh 1
	private double second;//
	private double third;//
	
	//ham khoi tao khong tham so
	public Triange(boolean choose) {
		//choose == false -> tam giac chua duoc khoi tao cac canh
		if(!choose){
			return;
		}
		
		//choose = true
		//nhap 3 canh tam giac tu ban phim
		//neu 3 canh khong thoa man yeu cau nhap lai
		Scanner scanner = new Scanner(System.in);
		boolean check = true;
		do {
			if(!check){
				System.out.println("Repeat:....");
			}
			System.out.print("First:\t<Double>");
			first = scanner.nextDouble();
			System.out.print("Second:\t<Double>");
			second = scanner.nextDouble();
			System.out.print("Third:\t<Double>");
			third = scanner.nextDouble();
			
			check = testTriange(first, second, third);
		} while (!check);
	}

	//constructor: ham khoi tao co tham so a,b,c
	public Triange(double first, double second, double third) {
		if(testTriange(first, second, third)){
			this.first = first;
			this.second = second;
			this.third = third;
		}
	}
	
	//kiem tra xem first,second,third co phai 3 canh cua 1 tam giac
	public boolean testTriange(double first, double second, double third){
		if(first<=0 || second<=0 || third <=0){
			return false;
		}
		
		if(((first + second) <= third) || ((first + third) <= second) || ((second + third) <= first)){
			return false;
		}
		
		return true;
	}
	
	//kiem tra tam giac thuong,can hay deu
	public String checkTypeTriange(double first, double second, double third){
		if(!testTriange(first, second, third)){
			return "fail";
		}else{
			if(first == second && first == third){
				return "equilateral";
			}else{
				if(first != second && first != third && second != third){
					if((first*first + second*second) == third*third
							|| (third*third + second*second) == first*first
							|| (first*first + third*third) == second*second)
					{
						return "square";
					}else
						return "general";
				}else{
					return "isosceles";
				}
			}
		}
	}

	public double getFirst() {
		return first;
	}

	public double getSecond() {
		return second;
	}

	public double getThird() {
		return third;
	}
}
