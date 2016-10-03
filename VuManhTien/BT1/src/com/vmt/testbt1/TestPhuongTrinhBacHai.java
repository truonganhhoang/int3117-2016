package com.vmt.testbt1;

import org.junit.Assert;
import org.junit.Test;

import com.vmt.bt1.PhuongTrinhBacHai;

public class TestPhuongTrinhBacHai {
	
	/* BT3 */
	
	/* kiểm thử giá trị biên */
	
	/* biên cận dưới các hệ số lần lượt bằng 0*/

	@Test
	public void testPhuongTrinhCoHaiNghiem(){
		double a = 1;
		double b = 22;
		double c = 1;
		
		PhuongTrinhBacHai ptBacHai = new PhuongTrinhBacHai(a, b, c);
		Assert.assertEquals(PhuongTrinhBacHai.State.HAI_NGHIEM, ptBacHai.getState());
	}
	
	@Test
	public void testPhuongTrinhCoNghiemKep(){
		double a = 1;
		double b = 2;
		double c = 1;
		
		PhuongTrinhBacHai ptBacHai = new PhuongTrinhBacHai(a, b, c);
		Assert.assertEquals(PhuongTrinhBacHai.State.NGHIEM_KEP, ptBacHai.getState());
	}
	
	@Test
	public void testPhuongTrinhVoNghiem(){
		double a = 1;
		double b = 2;
		double c = 3;
		
		PhuongTrinhBacHai ptBacHai = new PhuongTrinhBacHai(a, b, c);
		Assert.assertEquals(PhuongTrinhBacHai.State.VO_NGHIEM, ptBacHai.getState());
	}
	
	@Test
	public void testPhuongTrinhBacMotCoMotNghiem(){
		double a = 0;
		double b = 2;
		double c = 3;
		
		PhuongTrinhBacHai ptBacHai = new PhuongTrinhBacHai(a, b, c);
		Assert.assertEquals(PhuongTrinhBacHai.State.MOT_NGHIEM, ptBacHai.getState());
	}
	
	@Test
	public void testPhuongTrinhBacMotVoNghiem(){
		double a = 0;
		double b = 0;
		double c = 3;
		
		PhuongTrinhBacHai ptBacHai = new PhuongTrinhBacHai(a, b, c);
		Assert.assertEquals(PhuongTrinhBacHai.State.VO_NGHIEM, ptBacHai.getState());
	}
	
	@Test
	public void testPhuongTrinhBacMotVoSoNghiem(){
		double a = 0;
		double b = 0;
		double c = 0;
		
		PhuongTrinhBacHai ptBacHai = new PhuongTrinhBacHai(a, b, c);
		Assert.assertEquals(PhuongTrinhBacHai.State.VO_SO_NGHIEM, ptBacHai.getState());
	}
}
