package com.andy;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    
    public AppTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testApp()
    {
    	JaccardEngine eng = new JaccardEngine();
    	
    	assertTrue(eng.jaccardIndex("I love you", "I love you") == 1.0);
    	
    	assertTrue(eng.jaccardIndex("I love you", "I love you you") == 1.0);
    	
    	assertTrue(eng.jaccardIndex("I love you", "I like her") < 1.0);
    	
    	assertTrue(eng.jaccardIndex("I love you", "She like him") == 0.0);
    }
    
    
}
