package pkdm2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNamNhuan {

	@Test
	public void test() {
		NamNhuan x = new NamNhuan();
		assertEquals(x.TimNamNhuan(2000),1);
	}
	
	@Test
	public void test2() {
		NamNhuan y = new NamNhuan();
		assertEquals(y.TimNamNhuan(2012),0);
	}

}
