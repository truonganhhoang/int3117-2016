//Hung.slumber
package pkResources;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResourcesTest {

	@Test
	public void testConsume() {
		Resources demoTest = new Resources();
		int consume[] = {3,5,7,14,20,30};
		int size = 30;
		int result = demoTest.conferResources(consume, size);
		assertEquals(29,result);
	}
	@Test
	public void testConferred() {
		Resources demoTest = new Resources();
		int consume[] = {10,15,20,25,30};
		int size = 50;
		int result = demoTest.conferResources(consume, size);
		assertEquals(50,result);
	}
}
