import static org.junit.Assert.*;

import org.junit.Test;


public class DayMonthYearTest {
	DayMonthYear test = new DayMonthYear();
	boolean result ;
	// test for month 2 contains firstDay, lastDay, midDay in normal year and leap year
	@Test
	public void m2_lastD_leapY (){	
		result = test.isDate("29/2/2000");
		assertEquals(true,result);
	}
	
	@Test
	public void m2_endD_norY (){	
		result = test.isDate("29/2/2001");
		assertEquals(false,result);
	}
	
	@Test
	public void m2_firstD0 (){	
		result = test.isDate("1/2/2020");	
		assertEquals(true,result);
	}
	@Test
	public void m2_firstD1 (){	
		result = test.isDate("-1/2/2001");
		assertEquals(false,result);
	}
	@Test
	public void m2_firstD2 (){	
		result = test.isDate("30/2/2001");
		assertEquals(false,result);
	}
	@Test
	public void m2_mid_D0 (){	
		result = test.isDate("15/2/2020");	
		assertEquals(true,result);
	}
	
	// test for months {1,3,5,7,8,10,12} contains firstDay, lastDay, midDay in normal year
	@Test
	public void m1_endD (){	
		result = test.isDate("31/1/2020");	
		assertEquals(true,result);
	}
	@Test
	public void m1_firstD (){	
		result = test.isDate("1/1/2020");	
		assertEquals(true,result);
	}
	@Test
	public void not_m1_lastD (){	
		result = test.isDate("32/1/2020");	
		assertEquals(false,result);
	}
	@Test
	public void not_m1_firstD (){	
		result = test.isDate("0/1/2020");	
		assertEquals(false,result);
	}
	// test for months {4,6,9,11} contains firstDay, lastDay, midDay in normal year
	@Test
	public void m4_endD (){	
		result = test.isDate("30/4/2020");	
		assertEquals(true,result);
	}
	@Test
	public void m4_firstD (){	
		result = test.isDate("1/4/2020");	
		assertEquals(true,result);
	}
	@Test
	public void not_m4_lastD (){	
		result = test.isDate("31/4/2020");	
		assertEquals(false,result);
	}

	// test
	
	
	@Test
	public void notDay (){	
		result = test.isDate("32/4/2020");	
		assertEquals(false,result);
	}
	@Test
	public void notMonth (){	
		result = test.isDate("1/13/2020");	
		assertEquals(false,result);
	}
	@Test
	public void notMonth (){	
		result = test.isDate("1/0/2020");	
		assertEquals(false,result);
	}
	@Test
	public void notYear (){	
		result = test.isDate("30/4/-123");	
		assertEquals(false,result);
	}
	
}

	
