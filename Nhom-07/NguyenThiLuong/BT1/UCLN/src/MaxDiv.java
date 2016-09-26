package Testing;

import java.util.Scanner;
public class MaxDiv {

	public static boolean inputData(){
		Scanner input = new Scanner(System.in);
		boolean check = false;
		int n = 0;
		while (!check) {
			System.out.print(" ");
			try {
				n = input.nextInt();
				check = true;
			} catch(Exception e){
				System.out.println("Enter number again, please!");
				input.nextLine();
			}
			
		}
		return check;
	}
	public static int maxDiv(int a, int b){
		int temp;
		a = Math.abs(a);
		b = Math.abs(b);
		if (a==0 ||b==0)
            return a+b;
		while(b!= 0){
			temp = a%b;
			a = b;
			b = temp;
		}
		return (a);
	}
	public static void main(String[] args) {
		int number1, number2;
		// TODO Auto-generated method stub
		System.out.println("Enter 2 numbers: ");
		System.out.print("Number1: ");
		number1 = inputData();
		System.out.print("Number2");
		number2 = inputData();
		System.out.println("Maximum division of " + number1 +" and " + number2 +"is " + maxDiv(number1, number2));
		
	}

}

