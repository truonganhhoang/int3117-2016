/**
 * Created by Vu Tung on 9/5/2016.
 */
import static org.junit.Assert.*;

public class Test {

    @org.junit.Test
    public void testArrayEvenOdd() {
        SumEvenNumberArray sumEvenNumberArray = new SumEvenNumberArray();
        int array[] = {1,2,3,4,5,6};
        int sum = sumEvenNumberArray.sumEvenNumber(array);
        assertEquals(12, sum);
    }
    @org.junit.Test
    public void testArrayEven() {
        SumEvenNumberArray sumEvenNumberArray = new SumEvenNumberArray();
        int array[] = {2,16,4};
        int sum = sumEvenNumberArray.sumEvenNumber(array);
        assertEquals(22, sum);
    }

    @org.junit.Test
    public void testArrayOdd() {
        SumEvenNumberArray sumEvenNumberArray = new SumEvenNumberArray();
        int array[] = {1,3,5};
        int sum = sumEvenNumberArray.sumEvenNumber(array);
        assertEquals(0, sum);
    }

    @org.junit.Test
    public void testArrayNull() {
        SumEvenNumberArray sumEvenNumberArray = new SumEvenNumberArray();
        int array[] = {};
        int sum = sumEvenNumberArray.sumEvenNumber(array);
        assertEquals(0, sum);
    }
}