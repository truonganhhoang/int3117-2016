package findnumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nhahv on 10/4/2016.
 * <></>
 */
public class FindNumberTest {

    FindNumber findNumber = new FindNumber();

    @Test
    public void main1() throws Exception {

        testRunTrueWithNumberStart100();
        testRunTrueWithNumberStart1();
        testRunTrueWithNumberStart0();
        testRunTrueWithNumberStartNegative100();
    }

    @Test
    public void testRunTrueWithNumberStart100() {
        FindNumber findNumber = new FindNumber();
        FindNumber.Number result = findNumber.findNumberDivisibleBy8(100);
        assertTrue("run with numberStart = 100", result.number1 == 90 && result.number2 == 110);
    }

    @Test
    public void testRunTrueWithNumberStart1() {
        FindNumber findNumber = new FindNumber();
        FindNumber.Number result = findNumber.findNumberDivisibleBy8(1);
        assertTrue("run with numberStart = 1", result.number1 == 3 && result.number2 == 5);
    }

    @Test
    public void testRunTrueWithNumberStartNegative100() {
        FindNumber findNumber = new FindNumber();
        FindNumber.Number result = findNumber.findNumberDivisibleBy8(-100);
        assertTrue("run with numberStart = -100", result.number1 == 90 && result.number2 == 110);
    }

    @Test
    public void testRunTrueWithNumberStart0() {
        FindNumber findNumber = new FindNumber();
        FindNumber.Number result = findNumber.findNumberDivisibleBy8(0);
        assertTrue("run with numberStart = 0", result == null);
    }

    /**
     * number1 % 3 = 0
     * number2 % 5 = 0
     * (number 1 + number2 ) % 8 != 0
     */
    @Test
    public void testNumberTrueNumber2TrueSumFails() {
        boolean result = findNumber.checkCondition(3, 15);
        assertEquals(false, result);
    }

    /**
     * number1 % 3 = 0
     * number2 % 5 = 0
     * (number 1 + number2 ) % 8 == 0
     */
    @Test
    public void testNumberTrueNumber2TrueSumTrue() {
        boolean result = findNumber.checkCondition(3, 5);
        assertEquals(true, result);
    }

    /**
     * number1 % 3 = 0
     * number2 % 5 != 0
     * (number 1 + number2 ) % 8 != 0
     */
    @Test
    public void testNumberTrueNumber2FalseSumFalse() {
        boolean result = findNumber.checkCondition(3, 6);
        assertEquals(false, result);
    }

    /**
     * number1 % 3 = 0
     * number2 % 5 != 0
     * (number 1 + number2 ) % 8 == 0
     */
    @Test
    public void testNumberTrueNumber2FalseSumTrue() {
        boolean result = findNumber.checkCondition(3, 13);
        assertEquals(false, result);
    }

    /**
     * number1 % 3 != 0
     * number2 % 5 == 0
     * (number 1 + number2 ) % 8 != 0
     */
    @Test
    public void testNumberFalseNumber2TrueSumFalse() {
        boolean result = findNumber.checkCondition(4, 5);
        assertEquals(false, result);
    }

    /**
     * number1 % 3 != 0
     * number2 % 5 == 0
     * (number 1 + number2 ) % 8 == 0
     */
    @Test
    public void testNumberFalseNumber2TrueSumTrue() {
        boolean result = findNumber.checkCondition(11, 5);
        assertEquals(false, result);
    }

    /**
     * number1 % 3 != 0
     * number2 % 5 != 0
     * (number1 + number2 ) % 8 != 0
     */
    @Test
    public void testNumberFalseNumber2FalseSumFalse() {
        boolean result = findNumber.checkCondition(4, 6);
        assertEquals(false, result);
    }

    /**
     * number1 % 3 != 0
     * number2 % 5 != 0
     * (number1 + number2 ) % 8 == 0
     */
    @Test
    public void testNumberFalseNumber2FalseSumTrue() {
        boolean result = findNumber.checkCondition(10, 6);
        assertEquals(false, result);
    }

}