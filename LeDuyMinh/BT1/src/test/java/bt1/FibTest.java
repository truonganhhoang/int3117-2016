package bt1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class FibTest {
	private Fib f;
	
	@Before
    public void initObjects() {
        f = new Fib();
    }
	
	@Test
	public void nNhoHon1() {
		String result = f.printFirstNFib(-10);
		assertEquals("Khong hop le", result);
	}
	
	@Test
	public void nHopLe() {
		String result = f.printFirstNFib(5);
		assertEquals("0 1 1 2 3", result);
	}
	
	@Test
	public void nLonHon100() {
		String result = f.printFirstNFib(110);
		assertEquals("So qua lon", result);
	}
}