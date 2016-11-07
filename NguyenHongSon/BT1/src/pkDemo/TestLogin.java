package pkDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLogin {
	
	@Test
	public void blank_u_and_blank_p() {
		DemoLogin d = new DemoLogin();
		String result = d.login("", "");
		assertEquals("Xin mời điền tên đăng nhập", result);
	}
	
	@Test
	public void blank_u_and_invalid_p() {
		DemoLogin d = new DemoLogin();
		String result = d.login("", "wrongpassword");
		assertEquals("Xin mời điền tên đăng nhập", result);
	}
	
	@Test
	public void blank_u_and_valid_p() {
		DemoLogin d = new DemoLogin();
		String result = d.login("", "123456789");
		assertEquals("Xin mời điền tên đăng nhập", result);
	}
	
	@Test
	public void invalid_u_and_blank_p() {
		DemoLogin d = new DemoLogin();
		String result = d.login("sonnhhh", "");
		assertEquals("Xin mời điền mật khẩu", result);
	}
	
	@Test
	public void invalid_u_and_invalid_p() {
		DemoLogin d = new DemoLogin();
		String result = d.login("sonnhhh", "1234567899");
		assertEquals("Đăng nhập thất bại", result);
	}
	
	@Test
	public void invalid_u_and_valid_p() {
		DemoLogin d = new DemoLogin();
		String result = d.login("sonnhhh", "123456789");
		assertEquals("Đăng nhập thất bại", result);
	}
	
	@Test
	public void valid_u_and_blank_p() {
		DemoLogin d = new DemoLogin();
		String result = d.login("sonnh58", "");
		assertEquals("Xin mời điền mật khẩu", result);
	}
	
	@Test
	public void valid_u_and_invalid_p() {
		DemoLogin d = new DemoLogin();
		String result = d.login("sonnh58", "1234567899");
		assertEquals("Đăng nhập thất bại", result);
	}
	
	@Test
	public void valid_u_and_valid_p() {
		DemoLogin d = new DemoLogin();
		String result = d.login("sonnh58", "123456789");
		assertEquals("Đăng nhập thành công", result);
	}

}
