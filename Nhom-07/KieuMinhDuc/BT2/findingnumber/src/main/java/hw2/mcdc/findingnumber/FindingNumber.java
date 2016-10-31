package hw2.mcdc.findingnumber;

/**
 * Finding number that can divisible by 4 or 400 but cant divisible by 100 
 * ( similar like leap year)
 *
 */
public class FindingNumber 
{
	public boolean isDivisibleBy4Number(int number){
		if ( number%4 == 0){
			return true;
		}else{
			return false;
		}
	}
	public boolean isDivisible400Number(int number){
		if ( number%400 == 0){
			return true;
		}else{
			return false;
		}
	}
	public boolean isDivisible100Number(int number){
		if ( number%100 == 0){
			return true;
		}else{
			return false;
		}
	}
	public boolean isValidate(int n ){
		if ( isDivisibleBy4Number(n)&& !isDivisible100Number(n)|| isDivisible400Number(n)){
			return true;			
		}else{
			return false;
		}
	}
	public boolean isCountingEvenNumber( int n ){ 	
		int count = 0;
		for ( int i = 0 ; i <= n ; i++ ){
			if (isValidate(n)){
				count++;			
			}
		}
		if ( count%2 == 0){
			return true;
		}else{
			return false;
		}
	}
   
}
