/**
 * Created by Vu Tung on 9/5/2016.
 */
import static org.junit.Assert.*;

public class Test {

    @org.junit.Test
    public void test1() {
        BT1 bt1 = new BT1();
        int mang[] = {1,2,3,4,5,6};
        int tong = bt1.tongSoChan(mang);
        assertEquals(12, tong);
    }
    @org.junit.Test
    public void test2() {
        BT1 bt1 = new BT1();
        int mang[] = {2,16,4};
        int tong = bt1.tongSoChan(mang);
        assertEquals(22, tong);
    }

    @org.junit.Test
    public void test3() {
        BT1 bt1 = new BT1();
        int mang[] = {1,3,5};
        int tong = bt1.tongSoChan(mang);
        assertEquals(0, tong);
    }

    @org.junit.Test
    public void test4() {
        BT1 bt1 = new BT1();
        int mang[] = {1,-2,3,16,5,6};
        int tong = bt1.tongSoChan(mang);
        assertEquals(20, tong);
    }





}