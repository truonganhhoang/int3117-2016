package ktpm2016.btvn1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Counting App.
 */
public class CountingTest 
    extends TestCase
{
   public void testIsPrime(){
	   Counting counting = new Counting();
	   assertEquals(false, counting.isPrime(8));	  
   }
   public void testIsEven(){
	   Counting counting = new Counting();
	   assertEquals(true, counting.isEven(0));	  
   }
   public void testIsPrimeAndEven(){
	   Counting counting = new Counting();
	   assertEquals(true, counting.isEven(4));	  
   }
   public void testEvenCount(){
	   Counting counting = new Counting();
	   assertEquals(250,counting.countEvenNumberSmallerThan500());
   }
   public void testPrimeCount(){
	   Counting counting = new Counting();
	   assertEquals(97,counting.countPrimeNumberSmallerThan500());	   
   }
   public void testEvenAndPrimeCount(){
	   Counting counting = new Counting();
	   assertEquals(2,counting.countEvenAndPrimeNumberSmallerThan500());
	   
   }
}
