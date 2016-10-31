/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author Administrator
 */
public class Fibonacci {
  
    /**
     * @param args the command line arguments
     */
        public static long fibonacci(long number){

		if((number >= 49)){
			return -1;
		}
		else if((number ==1) || (number ==2)){
			return 1;
		}
		else
		{
			int f1=1, f2=2, f3=0;
			for(int i=3; i<=number; i++)
			{
				f3 = f1 + f2;
				f1 = f2;
				f2 = f3;
			}
			return f3;
		}
	
	}
	public static void main(String[] args){
            System.out.println("Gia tri cua so fibo : 25\t" + fibonacci(25));
                System.out.println("Gia tri cua so fibo : 47\t"  + fibonacci(47));
		System.out.println("Gia tri cua so fibo : 10\t"  + fibonacci(10));
		System.out.println("Gia tri cua so fibo : 50\t" + fibonacci(50));
	}

}
    

