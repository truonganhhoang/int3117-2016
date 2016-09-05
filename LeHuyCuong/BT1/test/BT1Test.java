import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by QuocCuong on 9/5/2016.
 */
public class BT1Test {
    @Test
    public void test1() throws Exception {
        BT1 bt = new BT1();
        int arr[] = {4,6,8,2,20,15};
        assertEquals(41, bt.tongCacUoc(arr));
    }

    @Test
    public void test2() throws Exception {
        BT1 bt = new BT1();
        int arr[] = {4,6,8,2,-20,15};
        assertEquals(1, bt.tongCacUoc(arr));
    }

    @Test
    public void test3() throws Exception {
        BT1 bt = new BT1();
        int arr[] = {2,9,8,2,-21,45};
        assertEquals(1, bt.tongCacUoc(arr));
    }

}