package sourcescode;

import static org.junit.Assert.*;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNot;
import org.junit.Test;

public class MyTest {

	@Test
	public void test() {
		MyClass sapxep = new MyClass();
		int a[] = new int[100];
		a[0] = 1; a[1] = 18; a[2]=5; a[3]=12; a[4]=3; a[5]=10; a[6]=7; a[7]=13; a[8]=2; a[9]=8;
		int b[] = sapxep.BubbleSort(a);
		int c[]= new int[100];
		c[9]=1; c[8]=2; c[7]=3; c[6]=5; c[5]=7; c[4]=8; c[3]=10; c[2]=12; c[1]=13; c[0]=18;
		assertArrayEquals(c, b);
	}
	@Test
	public void testSoAm() {
		MyClass sapxep = new MyClass();
		int a[] = new int[5];
		a[0] = -1; a[1] =0; a[2]=5; a[3]=-12; a[4]=3;
		int b[] = sapxep.BubbleSort(a);
		assertArrayEquals(new int []{5,3,0,-1,-12}, b);
	}
	@Test
	public void testSoLon() {
		MyClass sapxep = new MyClass();
		int a[] = new int[5];
		a[0] = 2147483647 ; a[1] =0; a[2]=5; a[3]= -2147483648; a[4]=3;
		int b[] = sapxep.BubbleSort(a);
		assertArrayEquals(new int []{2147483647,5,3,0,-2147483648}, b);
	}
	@Test
	public void testSoThuc() {
		MyClass sapxep = new MyClass();
		int a[] = new int[5];
		a[0] = 7; a[1] =0; a[2]=5; a[3]=-12; a[4]=3;
		int b[] = sapxep.BubbleSort(a);
		assertThat(new double []{7.0,5.0,3.0,0.0,-12.0}, IsNot.not(IsEqual.equalTo(b)));
	}
	
	
}
