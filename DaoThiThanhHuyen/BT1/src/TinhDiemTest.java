package main;
import static org.junit.Assert.*;

import org.junit.*;

public class TinhDiemTest {
  @Test
  //test gia tri bien cua A(80-100): 80, 81, 90, 100
  public void testDiemA() {
      assertEquals("A", TinhDiem.PhanLoai(80));
      assertEquals("A", TinhDiem.PhanLoai(81));
      assertEquals("A", TinhDiem.PhanLoai(90));
      assertEquals("A", TinhDiem.PhanLoai(100));
  }

  @Test
  //test gia tri bien cua B(60-79): 60, 61, 70, 79
  public void testDiemB() {
      assertEquals("B", TinhDiem.PhanLoai(60));
      assertEquals("B", TinhDiem.PhanLoai(61));
      assertEquals("B", TinhDiem.PhanLoai(70));
      assertEquals("B", TinhDiem.PhanLoai(79));
  }

  @Test
  //test gia tri bien cua C(50-59): 50, 51, 55, 59
  public void testDiemC() {
      assertEquals("C", TinhDiem.PhanLoai(50));
      assertEquals("C", TinhDiem.PhanLoai(51));
      assertEquals("C", TinhDiem.PhanLoai(55));
      assertEquals("C", TinhDiem.PhanLoai(59));
  }
  
  @Test
  //test gia tri bien cua D(40-49): 40, 41, 45 , 49
  public void testDiemD() {
      assertEquals("D", TinhDiem.PhanLoai(40));
      assertEquals("D", TinhDiem.PhanLoai(41));
      assertEquals("D", TinhDiem.PhanLoai(45));
      assertEquals("D", TinhDiem.PhanLoai(49));
  }

  @Test
  //test gia tri bien cua F(0-39): 0, 1, 10, 39
  public void testDiemF() {
      assertEquals("F", TinhDiem.PhanLoai(0));
      assertEquals("F", TinhDiem.PhanLoai(1));
      assertEquals("F", TinhDiem.PhanLoai(10));
      assertEquals("F", TinhDiem.PhanLoai(39));
  }
  
  @Test
  //test gia tri Khong hop le ngoai khoang(0-100)
  public void testGiaTriKhongHopLe() {
    assertEquals("Khong hop le", TinhDiem.PhanLoai(-20));
    assertEquals("Khong hop le", TinhDiem.PhanLoai(200));
  }
}