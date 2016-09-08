/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeric;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author doanvanthien
 */
public class IsNumericTest {
    IsNumeric isNumeric;
    
    public IsNumericTest() {
        this.isNumeric = new IsNumeric();
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
    
    @Test
    public void testIsNumericTrue_v1(){
        assertEquals(this.isNumeric.is_Numeric("123"), true);
    }
    @Test
    public void testIsNumericTrue_v2(){
        assertEquals(this.isNumeric.is_Numeric("123.13"), true);
    }
    @Test
    public void testIsNumericTrue_v3(){
        assertEquals(this.isNumeric.is_Numeric("-123.13"), true);
    }
    @Test
    public void testIsNumericTrue_v4(){
        assertEquals(this.isNumeric.is_Numeric("-123"), true);
    }
    @Test
    public void testIsNumericTrue_v5(){
        assertEquals(this.isNumeric.is_Numeric("-."), true);
    }
    
    @Test
    public void testIsNumericFalse_v1(){
        assertEquals(this.isNumeric.is_Numeric("-"), false);
    }
    
    @Test
    public void testIsNumericFalse_v2(){
        assertEquals(this.isNumeric.is_Numeric("132ac23423"), false);
    }
    @Test
    public void testIsNumericFalse_v3(){
        assertEquals(this.isNumeric.is_Numeric("-....."), false);
    }
    @Test
    public void testIsNumericFalse_v4(){
        System.out.println(this.isNumeric.is_Numeric("-.-"));
        assertEquals(this.isNumeric.is_Numeric("-.-"), false);
    }
    @Test
    public void testIsNumericFalse_v5(){
        assertEquals(this.isNumeric.is_Numeric(""), false);
    }
    @Test
    public void testIsNumericFalse_v6(){
        assertEquals(this.isNumeric.is_Numeric("           "), false);
    }
    @Test
    public void testIsNumericFalse_v7(){
        assertEquals(this.isNumeric.is_Numeric("-.      -"), false);
    }
}
