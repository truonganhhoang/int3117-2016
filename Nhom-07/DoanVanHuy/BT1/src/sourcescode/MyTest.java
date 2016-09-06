package sourcescode;

import static org.junit.Assert.*;


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

}
