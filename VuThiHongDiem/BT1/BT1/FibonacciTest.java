/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class FibonacciTest {
    
    public FibonacciTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of fibonacci method, of class Fibonacci.
     */
    // kiểm thử biên
    // kiểm thử biên mạnh
    /*
 
 
     * kiểm thử biên mạnh chọn các giá trị: number = 0, 1, 2, 48 , 49, 50, 51
     *
     * */
    @Test
    //kiem thu xung quanh gia tri min
    public void testFibonacci() {
        System.out.println("fibonacci");
        long number = 1L;
        long expResult = 1L;
        long result = Fibonacci.fibonacci(number);
        assertEquals(expResult, result);
        fail("Sai");
    }
    
    public void testFibonacci1() {
        System.out.println("fibonacci");
        long number = 0L;
        long expResult = 0L;
        long result = Fibonacci.fibonacci(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Sai");
    }
    
    @Test
    public void testFibonacci2() {
        System.out.println("fibonacci");
        long number = 2L;
        long expResult = 1;
        long result = Fibonacci.fibonacci(number);
        assertEquals(expResult, result);
        fail("Sai");
    }
    
    @Test
    public void testFibonacci3() {
        System.out.println("fibonacci");
        long number = 25L;
        long expResult = 121393;
        long result = Fibonacci.fibonacci(number);
        assertEquals(expResult, result);
        fail("Sai");
    }
    @Test
    //kiem thu xung quanh gia tri max
     public void testFibonacci4() {
        System.out.println("fibonacci");
        long number = 47L;
        long expResult = 512559680 ;
        long result = Fibonacci.fibonacci(number);
        assertEquals(expResult, result);
        fail("Sai");
    } 
     
    public void testFibonacci5() {
        System.out.println("fibonacci");
        long number = 48L;
        long expResult = 811192543 ;
        long result = Fibonacci.fibonacci(number);
        assertEquals(expResult, result);
        fail("Sai");
    }
    
    
    @Test
    public void testFibonacci6() {
        System.out.println("fibonacci");
        long number = 49L;
        long expResult = -1;
        long result = Fibonacci.fibonacci(number);
        assertEquals(expResult, result);
        fail("Sai");
    }
    
    @Test
    public void testFibonacci7() {
        System.out.println("fibonacci");
        long number = 50L;
        long expResult = -1;
        long result = Fibonacci.fibonacci(number);
        assertEquals(expResult, result);
        fail("Sai");
    }
    
    @Test
    public void testFibonacci8() {
        System.out.println("fibonacci");
        long number = 51L;
        long expResult = -1;
        long result = Fibonacci.fibonacci(number);
        assertEquals(expResult, result);
        fail("Sai");
    }

    /**
     * Test of main method, of class Fibonacci.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Fibonacci.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
