package ktpm2016.btvn1;

/**
 * Counting even and prime number smaller than 500
 *
 */
public class Counting 
{
   public int countEvenNumberSmallerThan500(){
	   
	   int count = 0;	
	   
	   for ( int i = 0 ; i < 500; i++){
		   if (isEven(i) ){
			   count++;
		   }
		   
	   }
	   
	   return count;
   }
   public int countPrimeNumberSmallerThan500(){
	   
	   int count = 0;	   
	   
	   for ( int i = 0 ; i < 500; i++){
		   if (isPrime(i) ){
			   count++;
		   }
		   
	   }
	   return count;
   }
   public int countEvenAndPrimeNumberSmallerThan500(){
	   
	   int count = 0;	   
	   
	   for ( int i = 0 ; i < 500; i++){		   
		   if(isPrimAndEven(i)){
			   count++;
		   }
		   
	   }
	   return count;
   }
   boolean isPrime( int n ) {
	    for( int i=2 ; i < n ; i++ ) {
	        if( n%i == 0 ){
	        	return false;
	        }
	            
	    }
	    return true;
   }
   boolean isEven( int n ){
	   if( n%2 == 0 ){
		  return true;   
	   }else{
		   return false;
	   }
   }
   boolean isPrimAndEven( int n ){
	   if(isEven(n)){
		   if ( isPrime(n)){
			   return true;
		   }
	   }
	   return false;
   }
   
}
