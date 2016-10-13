package BT2;

import java.util.Scanner;

public class DayInMonth {
	int month,year;
	public static int Number_Day_In_Month(int month, int year){
		
			if(month == 1 || month == 3 || month == 5 || month == 7 ||month ==8|| month ==11 || month ==12){
				return 31;
				
			}
			if (month == 4||month ==6 || month == 9|| month==11){
				return 30;
			}
			if (year %400 ==0||(year %4 == 0 && year %100 !=0)){
				return 29;
			}
			else return 28;
			
		}
	
	
}


