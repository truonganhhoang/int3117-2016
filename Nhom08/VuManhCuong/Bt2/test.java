import org.junit.Test;

import static org.junit.Assert.*;

public class SoNguyenTest {

    @Test
    public void testInMax0() throws Exception {
        SoNguyen soNguyen = new SoNguyen();
        int kq = soNguyen.inMax();
        assertEquals(10, kq);
    }

    @Test
    public void testInMax1() throws Exception {
        SoNguyen soNguyen = new SoNguyen();
        int kq = soNguyen.inMax();
        assertEquals(9, kq);
    }

    @Test
    public void testInMax2() throws Exception {
        SoNguyen soNguyen = new SoNguyen();
        int kq = soNguyen.inMax();
        assertEquals(8, kq);
    }

    @Test
    public void testInMax3() throws Exception {
        SoNguyen soNguyen = new SoNguyen();
        int kq = soNguyen.inMax();
        assertEquals(7, kq);
    }

    @Test
    public void testInMax4() throws Exception {
        SoNguyen soNguyen = new SoNguyen();
        int kq = soNguyen.inMax();
        assertEquals(8, kq);
    }

    @Test
    public void testInMax5() throws Exception {
        SoNguyen soNguyen = new SoNguyen();
        int kq = soNguyen.inMax();
        assertEquals(7, kq);
    }
}