package chinhvm.week1.demo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	int[] x = {1,3,3,5};
    	App a = new App(x);
    	assertEquals(3.0, a.findAverage());
    	    	
       	int[] x2 = {2,6,4,7,8,2,1};
      	App a2 = new App(x2);
      	assertEquals(1, a2.findMin());
    	    
    }
}
