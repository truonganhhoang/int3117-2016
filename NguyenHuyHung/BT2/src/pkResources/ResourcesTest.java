//Hung.slumber
package pkResources;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResourcesTest {

	@Test
	public void testConsumeBiggerSize() {
		Resources demoTest = new Resources();
		int consume[] = {9,5,3,5,10};
		int size = 20;
		int result = demoTest.conferResources(consume, size);
		assertEquals(18,result);
	}
	@Test
	public void testSizeBiggerConsume() {
		Resources demoTest = new Resources();
		int consume[] = {8,15,6,11,22};
		int size = 70;
		int result = demoTest.conferResources(consume, size);
		assertEquals(62,result);
	}
	@Test
	public void testAfterIndexIsBig() {
		Resources demoTest = new Resources();
		int consume[] = {7,20,5,30,3,14};
		int size = 30;
		int result = demoTest.conferResources(consume, size);
		assertEquals(29,result);
	}
	@Test
	public void testLastIsIncorrect() {
		Resources demoTest = new Resources();
		int consume[] = {15,10,20,30,25};
		int size = 50;
		int result = demoTest.conferResources(consume, size);
		assertEquals(50,result);
	}
}
