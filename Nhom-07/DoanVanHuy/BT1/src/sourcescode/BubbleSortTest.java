package sourcescode;

import static org.junit.Assert.*;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNot;
import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void test() {
		BubbleSort sort = new BubbleSort();
		int array[] = new int[10];
		array[0] = 1; array[1] = 18; array[2]=5; array[3]=12; array[4]=3; array[5]=10; array[6]=7; array[7]=13; array[8]=2; array[9]=8;
		int arraySwap[] = sort.BubbleSortCode(array);
		assertArrayEquals(new int []{18,13,12,10,8,7,5,3,2,1}, arraySwap);
	}
	@Test
	public void testArayNull() {
		BubbleSort sort = new BubbleSort();
		int array[] = null;
		array = sort.BubbleSortCode(array);
		assertNull(array);
	}
	@Test
	public void testSoAm() {
		BubbleSort sort = new BubbleSort();
		int array[] = new int[5];
		array[0] = -1; array[1] =0; array[2]=5; array[3]=-12; array[4]=3;
		array = sort.BubbleSortCode(array);
		assertArrayEquals(new int []{5,3,0,-1,-12}, array);
	}
	@Test
	public void testSoLon() {
		BubbleSort sort = new BubbleSort();
		int array[] = new int[5];
		array[0] = 2147483647 ; array[1] =0; array[2]=5; array[3]= -2147483648; array[4]=3;
		array = sort.BubbleSortCode(array);
		assertArrayEquals(new int []{2147483647,5,3,0,-2147483648}, array);
	}
	@Test
	public void testSoThuc() {
		BubbleSort sort = new BubbleSort();
		int array[] = new int[5];
		array[0] = 7; array[1] =0; array[2]=5; array[3]=-12; array[4]=3;
		array = sort.BubbleSortCode(array);
		assertThat(new double []{7.0,5.0,3.0,0.0,-12.0}, IsNot.not(IsEqual.equalTo(array)));
	}
	
	
}
