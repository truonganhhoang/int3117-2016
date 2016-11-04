package quoccuong.uet.vn;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by QuocCuong on 9/26/2016.
 */
public class tongCacUocCuaBaVaNamTest {
    @Test
    public void boiCuaN() throws Exception {
        tongCacUocCuaBaVaNam bt = new tongCacUocCuaBaVaNam();
        assertEquals(true,bt.boiCuaN(5,15));
    }


    @Test
    public void mangNull() throws Exception {
        tongCacUocCuaBaVaNam bt = new tongCacUocCuaBaVaNam();
        int arr[] = {} ;
        assertEquals(-1, bt.tongCacUoc(arr));
    }

    @Test
    public void mangChuaBoiCuaBa() throws Exception{
        tongCacUocCuaBaVaNam bt = new tongCacUocCuaBaVaNam();
        int arr[] = {3};
        assertEquals(3,bt.tongCacUoc(arr));
    }

    @Test
    public void mangChuaBoiCuaNam() throws Exception{
        tongCacUocCuaBaVaNam bt = new tongCacUocCuaBaVaNam();
        int arr[] = {5};
        assertEquals(5, bt.tongCacUoc(arr));
    }

    @Test
    public void mangChuaBoiCuaBaVaNam() throws Exception{
        tongCacUocCuaBaVaNam bt = new tongCacUocCuaBaVaNam();
        int arr[] = {15};
        assertEquals(15, bt.tongCacUoc(arr));
    }

}