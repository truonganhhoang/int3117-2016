package Test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chung
 */

public class SinhVienTest {
	//Test tai tb =0
	@Test
	public void testhocluc0(){
		 SinhVien sv = new SinhVien();
		 sv.toan = 0;
		 sv.van = 0;
		 assertEquals("Yeu", sv.hocluc());
	}
	
	//Test tai tb =4
		@Test
		public void testhocluc4(){
			 SinhVien sv = new SinhVien();
			 sv.toan = 4;
			 sv.van = 4;
			 assertEquals("Trung Binh", sv.hocluc());
		}
		
		//Test tai tb =7
		@Test
		public void testhocluc7(){
			 SinhVien sv = new SinhVien();
			 sv.toan = 7;
			 sv.van = 7;
			 assertEquals("Kha", sv.hocluc());
		}
		
		//Test tai tb =9
		@Test
		public void testhocluc9(){
			 SinhVien sv = new SinhVien();
			 sv.toan = 9;
			 sv.van = 9;
			 assertEquals("Gioi", sv.hocluc());
		}
		
		//Test tai tb =10
		@Test
		public void testhocluc10(){
			 SinhVien sv = new SinhVien();
			 sv.toan = 10;
			 sv.van = 10;
			 assertEquals("Gioi", sv.hocluc());
		}

}
