
package examples.asg02;
import org.junit.Test;

import static org.junit.Assert.*;


public class AppTest {
		Number number = new Number();
		
	   @Test
	   public void test1() {
	      int result = number.foo(6,7,8);
	      assertEquals(0, result, 0.0);
	   }
	   @Test
	   public void test2() {
	      int result = number.foo(6,7,6);
	      assertEquals(11, result, 0.0);
	   }
	   @Test
	   public void test3() {
	      int result = number.foo(5,7,7);
	      assertEquals(13, result, 0.0);
	   }
	   @Test
	   public void test4() {
	      int result = number.foo(5,11,5);
	      assertEquals(0, result, 0.0);
	   }
	   @Test
	   public void test5() {
	      int result = number.foo(-1,5,5);
	      assertEquals(0, result, 0.0);
	   }
	   
	   
	   
	   
	   
	   
}
