package BT2;

import java.util.Scanner;

public  class DayInMonth {
	int month=1,year=1;
	private static Scanner input;
	public static int Number_Day_In_Month(int month, int year){
		while(month>0 && month <=12){
			if(month == 1 || month == 3 || month == 5 || month == 7 ||month ==8|| month ==11 || month ==12){
				return 31;
				
			}
			else if (month == 4||month ==6 || month == 9|| month==11){
				return 30;
			}
			else if (year %400 ==0||(year %4 == 0 && year %100 !=0)){
				return 29;
			}
			else return 28;
				 
		}
		
		return 0;
	}
	
}
