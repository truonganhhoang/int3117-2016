package kiemthu;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author QuocCuong
 */
public class KiemThuTest {
    KiemThu test = new KiemThu();
    /**
     * Test of timso method, of class KiemThu.
     */
    @Test
    public void khongtimduoc() {
        
        int[] mang = {1, 2, 3, 4, 9};
        assertEquals(-1, test.timso(mang));

    }

    //{A,B,C,D} == {T,T,F,T};
    @Test
    public void boiCua3LonHon20KhongLaBoi5Nhohon50() {
        int[] mang = {21,67,47};
        assertEquals(21, test.timso(mang));
    }
    
    //{A,B,C,D} == {T,T,T,F};
    @Test
    public void boiCua3LonHon20LaBoi5Lonhon50() { 
        int[] mang = {21,90,69};
        assertEquals(180,test.timso(mang));      
    } 
    
    //{A,B,C,D} == {T,F,T,T};
    @Test
    public void boiCua3NhoHon20LaBoi5Nhohon50() {   
        int[] mang = {12,5,68};
        assertEquals(5,test.timso(mang));      
    } 
    
    //{A,B,C,D} == {F,T,T,T};
    @Test
    public void khongLaBoiCua3LonHon20LaBoi5Nhohon50() {  
        int[] mang = {25,5,49};
        assertEquals(30,test.timso(mang));      
    } 
    
    //{A,B,C,D} == {T,F,F,T};
    @Test
    public void laBoiCua3NhoHon20KhongLaBoi5Nhohon50() {  
        int[] mang = {6,76,49};
        assertEquals(-1,test.timso(mang));      
    } 
    
    //{A,B,C,D} == {T,F,T,F};
    @Test
    public void LaBoiCua3LonHon20LaBoi5Lonhon50() {  
        int[] mang = {9,52,70};
        assertEquals(-1,test.timso(mang));      
    } 
    //{A,B,C,D} == {F,T,F,T};
    @Test
    public void khongLaBoiCua3LonHon20KhongLaBoi5Nhohon50() {  
        int[] mang = {46,71,89};
        assertEquals(-1,test.timso(mang));      
    } 
  
    //{A,B,C,D} == {F,T,T,F};
    @Test
    public void khongLaBoiCua3LonHon20LaBoi5Lonhon50() {  
        int[] mang = {55,85,49};
        assertEquals(-1,test.timso(mang));      
    } 
   
}
