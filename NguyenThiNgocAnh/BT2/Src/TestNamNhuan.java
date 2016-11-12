package pkdm2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNamNhuan {

	@Test
	public void test() {
		NamNhuan y = new NamNhuan();
		assertEquals(y.TimNamNhuan(2000),1);
		assertEquals(y.TimNamNhuan(2012),0);
		assertEquals(y.TimNamNhuan(1900),2);
		assertEquals(y.TimNamNhuan(2001),2);
	}

}
