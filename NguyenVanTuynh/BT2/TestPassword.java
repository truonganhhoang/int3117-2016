package bt2;

import junit.framework.TestCase;


public class TestPassword extends TestCase {
   
	Password pw=new Password();
	public void test_error_less(){
		assertEquals("Ban chi duoc phep nhap chuoi tu 6-20 ki tu", pw.get_password("ab1"));
	}
	public void test_error_more(){
		assertEquals("Ban chi duoc phep nhap chuoi tu 6-20 ki tu", pw.get_password("nguyenvantuynhgiaolacgiaothuynamdinh"));
	}
	public void test_success(){
		assertEquals("Dang nhap thanh cong", pw.get_password("abcd12345"));
	}	
	public void test_rong(){
		assertEquals("Ban hay nhap password", pw.get_password(""));
	}
}

