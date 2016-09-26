/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeric;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author doanvanthien
 */
public class IsNumericTest {
    IsNumeric isNumeric;
    
    public IsNumericTest() {
        this.isNumeric = new IsNumeric();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void xau_la_so_nguyen_duong_true(){
        assertEquals(this.isNumeric.is_Numeric("123"), true);
    }
    @Test
    public void xau_la_so_thuc_duong_true(){
        assertEquals(this.isNumeric.is_Numeric("123.13"), true);
    }
    @Test
    public void xau_la_so_thuc_am_true(){
        assertEquals(this.isNumeric.is_Numeric("-123.13"), true);
    }
    @Test
    public void xau_la_so_nguyen_am_true(){
        assertEquals(this.isNumeric.is_Numeric("-123"), true);
    }
    @Test
    public void xau_la_so_thuc_am_khong_true(){
        assertEquals(this.isNumeric.is_Numeric("-."), true);
    }
    
    @Test
    public void xau_chua_dau_cong_dau_tru_va_dau_thap_phan_true(){
        assertEquals(this.isNumeric.is_Numeric("-++++++-+-+-+-+-."), true);
    }
    @Test
    public void xau_chua_dau_cong_dau_tru_va_dau_thap_phan_va_so_true(){
        assertEquals(this.isNumeric.is_Numeric("-++++++-+-+-+-+-123."), true);
    }
    
    @Test
    public void xau_la_dau_tru_false(){
        assertEquals(this.isNumeric.is_Numeric("-"), false);
    }
    
    @Test
    public void xau_chua_ca_so_va_chu_false(){
        assertEquals(this.isNumeric.is_Numeric("132ac23423"), false);
    }
    @Test
    public void xau_chua_dau_tru_va_dau_thap_phan_false(){
        assertEquals(this.isNumeric.is_Numeric("-....."), false);
    }
    @Test
    public void xau_chua_dau_tru_va_dau_thap_phan_1_false(){
        System.out.println(this.isNumeric.is_Numeric("-.-"));
        assertEquals(this.isNumeric.is_Numeric("-.-"), false);
    }
    @Test
    public void xau_la_xau_rong_false(){
        assertEquals(this.isNumeric.is_Numeric(""), false);
    }
    @Test
    public void xau_chi_chua_khoang_trong_false(){
        assertEquals(this.isNumeric.is_Numeric("           "), false);
    }
    @Test
    public void xau_chua_dau_tru_va_dau_thap_phan_va_khoang_trong_false(){
        assertEquals(this.isNumeric.is_Numeric("-.      -"), false);
    }
    
    @Test
    public void xau_chua_dau_cong_va_dau_tru_false(){
        assertEquals(this.isNumeric.is_Numeric("++---+++++++--+-+"), false);
    }
}
