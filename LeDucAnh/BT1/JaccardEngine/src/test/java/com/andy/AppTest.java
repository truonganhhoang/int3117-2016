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
    	
    	String s1 = "I love you";
    	String s2 = "I love her";
    	String s3 = "She like him";
    	
    	//Xac dinh lop bien ve he so do tuong tu nam trong doan: [0.0, 1.0]
    	
    	/**
    	 * Kiem thu lop bien tren 1.0
    	 */
    	// 2 chuoi giong nhau: s1 == s1
    	assertFalse(eng.jaccardIndex(s1, s1) > 1.0);
    	assertTrue(eng.jaccardIndex(s1, s1) == 1.0);
    	assertFalse(eng.jaccardIndex(s1, s1) < 1.0);
    	
    	// 2 chuoi gan giong nhau: s1 ~ s2
    	assertFalse(eng.jaccardIndex(s1, s2) == 1.0);
    	assertTrue(eng.jaccardIndex(s1, s2) < 1.0);
    	assertFalse(eng.jaccardIndex(s1, s2) > 1.0);
    	
    	//2 chuoi khac nhau hoan toan: s1 != s3
    	assertTrue(eng.jaccardIndex(s1, s3) < 1.0);
    	assertFalse(eng.jaccardIndex(s1, s3) == 1.0);
    	assertFalse(eng.jaccardIndex(s1, s3) > 1.0);
    	
    	/**
    	 * Kiem thu lop bien duoi 0.0
    	 */
    	// 2 chuoi giong nhau: s1 == s1
    	assertTrue(eng.jaccardIndex(s1, s1) > 0.0);
    	assertFalse(eng.jaccardIndex(s1, s2) == 0.0);
    	assertFalse(eng.jaccardIndex(s1, s1) < 0.0);
    	
    	// 2 chuoi gan giong nhau: s1 ~ s2
    	assertFalse(eng.jaccardIndex(s1, s2) == 0.0);
    	assertFalse(eng.jaccardIndex(s1, s2) < 0.0);
    	assertTrue(eng.jaccardIndex(s1, s2) > 0.0);
    	
    	//2 chuoi khac nhau hoan toan: s1 != s3
    	assertFalse(eng.jaccardIndex(s1, s3) < 0.0);
    	assertTrue(eng.jaccardIndex(s1, s3) == 0.0);
    	assertFalse(eng.jaccardIndex(s1, s3) > 0.0);
    }
    
    
}
