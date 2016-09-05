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
	   Counting app = new Counting();
	   assertEquals(false, app.isPrime(8));	  
   }
   public void testIsEven(){
	   Counting app = new Counting();
	   assertEquals(true, app.isEven(0));	  
   }
   public void testEvenCount(){
	   Counting app = new Counting();
	   assertEquals(250,app.countEvenNumberSmallerThan500());
   }
   public void testPrimeCount(){
	   Counting app = new Counting();
	   assertEquals(50,app.countPrimeNumberSmallerThan500());	   
   }
   public void testEvenAndPrimeCount(){
	   Counting app = new Counting();
	   assertEquals(15,app.countEvenAndPrimeNumberSmallerThan500());
   }
}
