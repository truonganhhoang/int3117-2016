package test;

import org.junit.Assert;
import main.Number;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class NumberTest {
    private Number number;
//
//    public static void main(String[] args) {
//        Result result = JUnitCore.runClasses(NumberTest.class);
//
//        for (Failure failure : result.getFailures()) {
//            System.out.println(failure.toString());
//        }
//        System.out.println(result.wasSuccessful());
//    }


    /**
     * Test function Check
     * @throws Exception
     */
    @Before
    public void before() throws Exception {
        number = new Number();
    }

    @Test
    public void checkOutOfBound() {
        Assert.assertEquals(false, number.check(-1));
    }

    @Test
    public void checkTTF() {
        Assert.assertEquals(true, number.check(6));
    }

    @Test
    public void checkTFT() {
        Assert.assertEquals(true, number.check(10));
    }

    @Test
    public void checkTFF() {
        Assert.assertEquals(false, number.check(4));
    }

    @Test
    public void checkFTF() {
        Assert.assertEquals(false, number.check(9));
    }


    /**
     * Test function getNumber
     */

    @Test
    public void nIsNegative() {
        Assert.assertEquals(-1, number.getNumber(-1));
    }

    @Test
    public void nIs0() {
        Assert.assertEquals(-1, number.getNumber(0));
    }

    @Test
    public void nIs10() {
        Assert.assertEquals(6, number.getNumber(2));
    }

} 
