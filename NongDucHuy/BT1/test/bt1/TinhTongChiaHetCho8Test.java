/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Huy
 */
public class TinhTongChiaHetCho8Test {

    public TinhTongChiaHetCho8Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test
    public void testGiaTriCucTieu() {
        TinhTongChiaHetCho8 tong = new TinhTongChiaHetCho8(0);
        long sum = (long) tong.getSum();
        assertEquals(0, sum);
    }

    @Test
    public void testTrenGiaTriCucTieu() {
        TinhTongChiaHetCho8 tong = new TinhTongChiaHetCho8(1);
        long sum = (long) tong.getSum();
        assertEquals(0, sum);
    }

    @Test
    public void testDuoiGiaTriCucTieu() {
        TinhTongChiaHetCho8 tong = new TinhTongChiaHetCho8(-1);        
        long sum = (long) tong.getSum();
        assertEquals(0, sum);
    }
    
    @Test
    public void testGiaTriCucDai() {
        TinhTongChiaHetCho8 tong = new TinhTongChiaHetCho8(100000);
        long sum = (long) tong.getSum();
        assertEquals(625050000, sum);
    }

    @Test
    public void testTrenGiaTriCucDai() {
        TinhTongChiaHetCho8 tong = new TinhTongChiaHetCho8(100001);
        long sum = (long) tong.getSum();
        assertEquals(0, sum);
    }

    @Test
    public void testDuoiGiaTriCucDai() {
        TinhTongChiaHetCho8 tong = new TinhTongChiaHetCho8(99999);
        long sum = (long) tong.getSum();
        assertEquals(624950000, sum);
    }
}
