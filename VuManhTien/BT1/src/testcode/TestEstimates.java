package testcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import sourcecode.Estimates;

public class TestEstimates {

	@Test
	public void testTimSoUoc() {
		Assert.assertEquals(1, Estimates.timSoLuongUoc(1));
		Assert.assertEquals(2, Estimates.timSoLuongUoc(2));
		Assert.assertEquals(3, Estimates.timSoLuongUoc(9));
		Assert.assertEquals(4, Estimates.timSoLuongUoc(10));
	}
	
	@Test
	public void testTimSoUocAdvance() {
		Assert.assertEquals(0, Estimates.timSoLuongUoc(-2));
		Assert.assertEquals(0, Estimates.timSoLuongUoc(-1));
		Assert.assertEquals(0, Estimates.timSoLuongUoc(0));
		Assert.assertEquals(1, Estimates.timSoLuongUoc(1));
		Assert.assertEquals(2, Estimates.timSoLuongUoc(2));
		Assert.assertEquals(3, Estimates.timSoLuongUoc(9));
		Assert.assertEquals(4, Estimates.timSoLuongUoc(10));
	}
	
	
}
