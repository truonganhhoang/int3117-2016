# Báo cáo bài tập tuần 1
##Thực hiện

##Chuẩn bị

Java SDK 1.7
Maven Eclipse IDE
Junit Plugin

##Cài đặt

Sử dụng Maven Project
Cài đặt Junit Plugin vao Eclipse
##Chạy test
Right click/Run as Junit

# Báo cáo bài tập tuần 3
## Phương pháp kiểm thử:
* Phương pháp: kiểm thử lớp tương đương
* Lý do : Bài toán được chia thành nhiều miền giá trị liên tục. Kiểm thử lớp tương đương bao phủ được toàn bộ các trường hợp test.
* Các miền giá trị:
    - Miền invalid: <0
    - Miền valid : <ul>
                  <li>+ (0,500)</li>
                  <li>+ [500,1000]</li>
                  <li>+ >1000</li>
                  </ul>
##Test case:</br>
package examples.asg01;
import org.junit.Test;

import static org.junit.Assert.*;


public class TestCustomer {
		CustomerBonus customerAccount = new CustomerBonus();
		CustomerDetails customer = new CustomerDetails();
  
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

##Kết quả chạy test case:
http://imgur.com/a/EMLdE
# Báo cáo bài tập tuần 4  
##Sơ đồ mô tả bài toán:  
Sử dụng tool code2flow để vẽ sơ đồ:  
http://imgur.com/a/oNswv
##Đo độ bao phủ của testcase:  
##Thực hiện  
Sử dụng EclEmma plugin for eclipse - code coverage tool
##Chạy tool  
Right click asg01/Coverage As
##Kết quả  
http://imgur.com/a/P9v77


