package BT2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Day_In_Month_Test {
	@Test
	public void Month_1(){
		DayInMonth test = new DayInMonth();
		int x = DayInMonth.Number_Day_In_Month(1,2004);
		assertEquals(31,x);
	}
	
	@Test
	public void Month_3(){
		DayInMonth test = new DayInMonth();
		int x = DayInMonth.Number_Day_In_Month(3,2004);
		assertEquals(31,x);
	}
	
	@Test
	public void Month_5(){
		DayInMonth test = new DayInMonth();
		int x = DayInMonth.Number_Day_In_Month(5,2004);
		assertEquals(31,x);
	}
	
	@Test
	public void Month_7(){
		DayInMonth test = new DayInMonth();
		int x = DayInMonth.Number_Day_In_Month(7,2004);
		assertEquals(31,x);
	}
	
	@Test
	public void Month_8(){
		DayInMonth test = new DayInMonth();
		int x = DayInMonth.Number_Day_In_Month(8,2004);
		assertEquals(31,x);
	}
	
	@Test
	public void Month_10(){
		DayInMonth test = new DayInMonth();
		int x = DayInMonth.Number_Day_In_Month(8,2004);
		assertEquals(31,x);
	}
	
	@Test
	public void Month_12(){
		DayInMonth test = new DayInMonth();
		int x = DayInMonth.Number_Day_In_Month(8,2004);
		assertEquals(31,x);
	}
	
	@Test
	public void Month_2_leap_year(){
		DayInMonth test = new DayInMonth();
		int x = DayInMonth.Number_Day_In_Month(2,2004);
		assertEquals(29,x);
	}
	
	@Test
	public void Month_2_common_year(){
		DayInMonth test = new DayInMonth();
		int x = DayInMonth.Number_Day_In_Month(2,2015);
		assertEquals(28,x);
	}
	
	@Test
	public void Month_12_common_year(){
		DayInMonth test = new DayInMonth();
		int x = DayInMonth.Number_Day_In_Month(12,2015);
		assertEquals(31,x);
	}
	
	@Test
	public void Month_12_leap_year(){
		DayInMonth test = new DayInMonth();
		int x = DayInMonth.Number_Day_In_Month(12,2004);
		assertEquals(31,x);
	}
	
	
	@Test
	public void Month_4(){
		DayInMonth test = new DayInMonth();
		int x = DayInMonth.Number_Day_In_Month(4,2004);
		assertEquals(30,x);
	}
    
	
}
