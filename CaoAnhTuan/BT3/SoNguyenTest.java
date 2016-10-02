package tuan1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by TuanIdol on 10/02/2016.
 */
public class SoNguyenTest {

    @Test
    public void testInMax0() throws Exception {
        SoNguyen soNguyen = new SoNguyen();
        int kq = soNguyen.inMax();
        assertEquals(99, kq);
    }

    @Test
    public void testInMax1() throws Exception {
        SoNguyen soNguyen = new SoNguyen();
        int kq = soNguyen.inMax();
        assertEquals(90, kq);
    }

    @Test
    public void testInMax2() throws Exception {
        SoNguyen soNguyen = new SoNguyen();
        int kq = soNguyen.inMax();
        assertEquals(66, kq);
    }

    @Test
    public void testInMax3() throws Exception {
        SoNguyen soNguyen = new SoNguyen();
        int kq = soNguyen.inMax();
        assertEquals(30, kq);
    }
}