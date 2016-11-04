
package examples.asg01;
import org.junit.Test;

import static org.junit.Assert.*;


public class TestCustomer {
		CustomerDetails customer = new CustomerDetails();
		CustomerBonus customerAccount = new CustomerBonus();
		
  
	   @Test
	   public void testPaymentMoneyMorethan500() {
	      customer.setName("thunt");
	      customer.setPaymentMoney(820);
	      customer.setBonus(0);
	      customer.setTime(4);
			
	      double bonus = customerAccount.calculateBonus(customer);
	      assertEquals(25, bonus, 0.0);
	   }

	   @Test
	   public void testPaymentMoneyLessthan500() {
	      customer.setName("thunt");
	      customer.setPaymentMoney(400);
	      customer.setBonus(15);
	      customer.setTime(4);
	      
	      double bonus = customerAccount.calculateBonus(customer);
	      assertEquals(15, bonus, 0.0);
	   }
	   
	   @Test
	   public void testPaymentMoneyMorethan1000() {
	      customer.setName("thunt");
	      customer.setPaymentMoney(1200);
	      customer.setBonus(15);
	      customer.setTime(4);
	      
	      double bonus = customerAccount.calculateBonus(customer);
	      assertEquals(50, bonus, 0.0);
	   }
	   
	   @Test
	   public void testFailPaymentMoney() {
	      customer.setName("thunt");
	      customer.setPaymentMoney(-0.5);
	      customer.setBonus(0);
	      customer.setTime(0);
	      double bonus = customerAccount.calculateBonus(customer);
	      equals("so tien tra khong dung");
	   }
}
