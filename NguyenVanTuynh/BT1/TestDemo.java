package Demo;

import junit.framework.TestCase;


public class TestDemo extends TestCase {
   //public static void main(String[] args){
	Practice pr=new Practice();
	public void test1(){
		assertEquals("Ban chi duoc phep nhap chuoi tu 6-20 ki tu", pr.password("ab1"));
	}
	public void test2(){
		assertEquals("Dang nhap thanh cong", pr.password("abcd12345"));
	}
	public void test3(){
		assertEquals("Ban chi duoc phep nhap chuoi tu 6-20 ki tu", pr.password("abcdefghikl1234567891"));
	}
	public void test4(){
		assertEquals("Ban hay nhap password", pr.password(""));
	}
}

