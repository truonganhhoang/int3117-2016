package findnumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Nhahv on 10/4/2016.
 * <></>
 */
public class FindNumberTest {
    @Test
    public void main1() throws Exception {

        testRunTrueWithNumberStart100();
        testRunTrueWithNumberStart1();
        testNumberTrueNumber2FalseSumFails();
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
        assertTrue("run with numberStart = 100", result.number1 == 3 && result.number2 == 5);
    }

    @Test
    public void testRunTrueWithNumberStartNegative100() {
        FindNumber findNumber = new FindNumber();
        FindNumber.Number result = findNumber.findNumberDivisibleBy8(-100);
        assertTrue("run with numberStart = 100", result.number1 == 90 && result.number2 == 110);
    }

    @Test
    public void testRunTrueWithNumberStart0() {
        FindNumber findNumber = new FindNumber();
        FindNumber.Number result = findNumber.findNumberDivisibleBy8(0);
        assertTrue("run with numberStart = 100", result == null);
    }

    @Test
    public void testNumberTrueNumber2FalseSumFails() {

    }

}