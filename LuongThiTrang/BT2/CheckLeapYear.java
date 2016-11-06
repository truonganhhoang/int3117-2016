package leapYear;


import java.util.Scanner;




public class CheckLeapYear {
	public static String NOT_RIGHT_LEAP_YEAR = "Not right leap year";
	public static String RIGHT_LEAP_YEAR = "Right leap year";
	public static String INVALID_YEAR = "Invalid year";
	
	public String checkYear(int year){
		
            if ((year%4==0 && year%100!=0) || year%400==0) {
            	return RIGHT_LEAP_YEAR;
            }
                
            else {
                return NOT_RIGHT_LEAP_YEAR;
            }
	}
		
		
	public void  inputYear(int year) {
		Scanner sc = new Scanner(System.in);
		boolean kt = false;
		while(!kt) {
			System.out.println("Input Year: ");
			year = sc.nextInt();
			if(year <=0){
				System.out.println(INVALID_YEAR);
			} else {
				kt = true;
				System.out.println(checkYear(year));
			}
		}
		
	}
	
	public static void main(String[] args){
		CheckLeapYear year = new CheckLeapYear();
		year.inputYear(0);
	}
}

