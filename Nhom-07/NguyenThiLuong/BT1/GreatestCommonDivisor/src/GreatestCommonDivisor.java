
/**
 * @author Nguyen Thi Luong 
 * Finding the greatest common divisor of 2 integer number
 */
public class GreatestCommonDivisor {
	
	public int preprocessData (String str) {
		
		try {

			int number = Integer.parseInt(str);
			number = Math.abs((int)number);
			return number;
		} 
		catch (NumberFormatException e){
			return -1;
		}
				
	}
	
	public String wrap (int number1, int number2)
	{
		String result = "number1 > number2 before wrap";
		if(number1 <= number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
			result = "wrapped";
		}
		return result;
	}

	public int greatestCommonDivisor( String str1, String str2) {
		
		int temp;
		int number1 = preprocessData(str1);
		int number2 = preprocessData(str2);
		wrap(number1,number2);
		
		if (number1 == 0 ||number2 == 0)
           	return number1+number2;
		
		while(number2!= 0){
			temp = number1%number2;
			number1 = number2;
			number2 = temp;
		}
			return number1;
	}	
}
