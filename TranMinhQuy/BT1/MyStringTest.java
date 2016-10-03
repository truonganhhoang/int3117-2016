import org.junit.*;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


/**
 * Created by tmq on 05/09/2016.
 */
public class MyStringTest {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MyStringTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }

    @Test
    public void testInputIsChar() {
        MyString myString = new MyString("bbbbbbbabbbbb");
        int[] value = myString.indexOf("a");
        Assert.assertArrayEquals(new int[]{7}, value);
    }

    @Test
    public void testInputIsCharAndResultIsEmpty() {
        MyString myString = new MyString("bbbbbbbbbbbb");
        int[] value = myString.indexOf("a");
        Assert.assertArrayEquals(new int[0], value);
    }

    @Test
    public void testInputIsCharAndResultIsPositionIsStart() {
        MyString myString = new MyString("abbbbbbbbbbbb");
        int[] value = myString.indexOf("a");
        Assert.assertArrayEquals(new int[]{0}, value);
    }

    @Test
    public void testInputIsCharAndResultIsPositionIsEnd() {
        MyString myString = new MyString("bbbbbbbbbbbbba");
        int[] value = myString.indexOf("a");
        Assert.assertArrayEquals(new int[]{13}, value);
    }

    @Test
    public void testInputIsCharAndResultIsMultiPosition() {
        MyString myString = new MyString("bbabbbbbabbbabb");
        int[] value = myString.indexOf("a");
        Assert.assertArrayEquals(new int[]{2, 8, 12}, value);
    }

    @Test
    public void testInputIsCharAndResultIsMultiPositionNear() {
        MyString myString = new MyString("bbbbbbaabbbbbb");
        int[] value = myString.indexOf("a");
        Assert.assertArrayEquals(new int[]{6, 7}, value);
    }

    @Test
    public void testInputIsCharAndResultIsAllIndex() {
        MyString myString = new MyString("aaaaaaaaaaaaaaa");
        int[] value = myString.indexOf("a");
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}, value);
    }


    // --------------------------------------------------------------------------

    @Test
    public void testInputIsString() {
        MyString myString = new MyString("bbbaabbbbb");
        int[] value = myString.indexOf("aa");
        Assert.assertArrayEquals(new int[]{3}, value);
    }

    @Test
    public void testInputIsStringAndResultIsEmpty() {
        MyString myString = new MyString("bbbbbbb");
        int[] value = myString.indexOf("aa");
        Assert.assertArrayEquals(new int[0], value);
    }

    @Test
    public void testInputIsStringAndResultIsPositionIsStart() {
        MyString myString = new MyString("aabbbbbbbb");
        int[] value = myString.indexOf("aa");
        Assert.assertArrayEquals(new int[]{0}, value);
    }

    @Test
    public void testInputIsStringAndResultIsPositionIsEnd() {
        MyString myString = new MyString("bbbbbbbbaa");
        int[] value = myString.indexOf("aa");
        Assert.assertArrayEquals(new int[]{8}, value);
    }

    @Test
    public void testInputIsStringAndResultIsMultiPosition() {
        MyString myString = new MyString("bbaabbbbbbaa");
        int[] value = myString.indexOf("aa");
        Assert.assertArrayEquals(new int[]{2, 10}, value);
    }

    @Test
    public void testInputIsStringAndResultIsMultiPositionNear() {
        MyString myString = new MyString("bbaaaabbbbbbaa");
        int[] value = myString.indexOf("aa");
        Assert.assertArrayEquals(new int[]{2, 3, 4, 12}, value);
    }

    @Test
    public void testInputIsStringAndResultIsAllIndex() {
        MyString myString = new MyString("aaaaaaaaaaaaaaa");
        int[] value = myString.indexOf("aaa");
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, value);
    }


}
