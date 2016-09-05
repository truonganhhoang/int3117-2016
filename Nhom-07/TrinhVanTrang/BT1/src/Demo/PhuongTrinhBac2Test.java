package Demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class PhuongTrinhBac2Test {

	@Test
	public void test_01() {
		PhuongTrinhBac2 test = new PhuongTrinhBac2();
		String x = test.giaiPT(0, 0, 0); 
		assertEquals("Phuong trinh co vo so nghiem",x);
	}
	
	@Test
	public void test_02(){
		PhuongTrinhBac2 test = new PhuongTrinhBac2();
		String x = test.giaiPT(0, 0, 4);
		assertEquals("Phuong trinh vo nghiem",x);			
	}
	
	@Test
	public void test_03_1 (){
		PhuongTrinhBac2 test = new PhuongTrinhBac2();
		String x = test.giaiPT(0, 2, 4);
		assertEquals("Phuong trinh co nghiem duy nhat"+-2.0 ,x);
	}
	
	@Test
	public void test_03_2 (){
		PhuongTrinhBac2 test = new PhuongTrinhBac2();
		String x = test.giaiPT(2, 0, 4);
		assertEquals("Phuong trinh vo nghiem",x);
	}
	
	@Test
	public void test_03_3 (){
		PhuongTrinhBac2 test = new PhuongTrinhBac2();
		String x = test.giaiPT(1, 1, 0);
		assertEquals("X1= " +0.0+ "X2= " +-1.0 ,x);
	}
	
	@Test
	public void test_04(){
		PhuongTrinhBac2 test = new PhuongTrinhBac2();
		String x = test.giaiPT(1, 1, 1);
		assertEquals("Phuong trinh vo nghiem",x);			
	}
	
	@Test
	public void test_05(){
		PhuongTrinhBac2 test = new PhuongTrinhBac2();
		String x = test.giaiPT(1, 2, 1);
		assertEquals("Phuong trinh co nghiem kep x1= x2= "+-1.0,x);			
	}
	
	@Test
	public void test_06(){
		PhuongTrinhBac2 test = new PhuongTrinhBac2();
		String x = test.giaiPT(1, 2, 1);
		assertEquals("Phuong trinh co nghiem kep x1= x2= "+-1.0,x);			
	}
	
	@Test
	public void test_07(){
		PhuongTrinhBac2 test = new PhuongTrinhBac2();
		String x = test.giaiPT(1, 5, 6);
		assertEquals("X1= " +-2.0+ "X2= " +-3.0,x);			
	}
	
	

}
