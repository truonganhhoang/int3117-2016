package pkChangePwd;

import static org.junit.Assert.*;

import org.junit.Test;

import pkChangePwd.DemoChangePassword;

public class TestChangePassword {

	@Test
	public void rightInput_rightPwd_rightNewPwd() {
		DemoChangePassword d = new DemoChangePassword();
		boolean result = d.changePwd("sonnh", "123456789", "11111");
		assertEquals(true, result);
	}
	
	@Test
	public void wrongInput_rightPwd_rightNewPwd() {
		DemoChangePassword d = new DemoChangePassword();
		boolean result = d.changePwd("sonnh1", "123456789", "11111");
		assertEquals(false, result);
	}
	
	@Test
	public void rightInput_wrongPwd_rightNewPwd() {
		DemoChangePassword d = new DemoChangePassword();
		boolean result = d.changePwd("sonnh", "12345678", "11111");
		assertEquals(false, result);
	}
	
	@Test
	public void rightInput_rightPwd_wrongNewPwd() {
		DemoChangePassword d = new DemoChangePassword();
		boolean result = d.changePwd("sonnh", "123456789", "123456789");
		assertEquals(false, result);
	}

}
