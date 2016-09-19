
package examples.asg01;
import org.junit.Test;

import static org.junit.Assert.*;


public class TestCustomer {
		CustomerBonus customerAccount = new CustomerBonus();
		CustomerDetails customer = new CustomerDetails();

	   
	   @Test
	   public void testBonus1() {
	      customer.setName("thunt");
	      customer.setPaymentMoney(820);
	      customer.setBonus(0);
	      customer.setTime(4);
			
	      double bonus = customerAccount.calculateBonus(customer);
	      assertEquals(25, bonus, 0.0);
	   }

	
	   @Test
	   public void testBonus2() {
	      customer.setName("thunt");
	      customer.setPaymentMoney(400);
	      customer.setBonus(15);
	      customer.setTime(4);
	      
	      double bonus = customerAccount.calculateBonus(customer);
	      assertEquals(15, bonus, 0.0);
	   }
	   @Test
	   public void testBonus3() {
	      customer.setName("thunt");
	      customer.setPaymentMoney(1200);
	      customer.setBonus(15);
	      customer.setTime(4);
	      
	      double bonus = customerAccount.calculateBonus(customer);
	      assertEquals(50, bonus, 0.0);
	   }
	   @Test
	   public void testBonus4() {
	      customer.setName("thunt");
	      customer.setPaymentMoney(-0.5);
	      customer.setBonus(0);
	      customer.setTime(0);
//	      System.out.println("nhap lai so tien tra");
	      double bonus = customerAccount.calculateBonus(customer);
	      assertEquals(-0.03, bonus, 0.0);
	   }
}
