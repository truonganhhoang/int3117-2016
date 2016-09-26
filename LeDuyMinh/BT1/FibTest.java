import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FibTest {
	@Test
	public void nNhoHon1() {
		Fib f = new Fib();
		String result = f.printFirstNFib(-10);
		assertEquals("Khong hop le", result);
	}
	
	@Test
	public void nHopLe() {
		Fib f = new Fib();
		String result = f.printFirstNFib(5);
		assertEquals("0 1 1 2 3", result);
	}
	
	@Test
	public void nLonHon100() {
		Fib f = new Fib();
		String result = f.printFirstNFib(110);
		assertEquals("So qua lon", result);
	}
}