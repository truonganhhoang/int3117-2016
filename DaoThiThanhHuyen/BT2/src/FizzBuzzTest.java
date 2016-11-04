import static org.junit.Assert.*;
import org.junit.*;

public class FizzBuzzTest {
	@Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.getResult(15));
        assertEquals("FizzBuzz", FizzBuzz.getResult(7));
    }

    @Test
    public void testFizz() {
    	String result = FizzBuzz.getResult(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void testBuzz() {
    	String result = FizzBuzz.getResult(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void testNumber() {
        String result = FizzBuzz.getResult(1);
        assertEquals("1", result);
    }
}
