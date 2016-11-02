## mô tả bài toán
* Giải phương trình bậc 2 dạng ax^2 + bx + c = 0 
* với input là các hệ số a, b và c

##Phương thức cần kiểm thử
```java

	public PhuongTrinhBacHai(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
		if (a != 0) giaiPhuongTrinhBacHai();
		else if (a == 0) giaiPhuongTrinhBacMot();
	}
	
	private void giaiPhuongTrinhBacHai(){
		delta = b*b - 4*a*c;
		if (delta < 0) state = State.VO_NGHIEM;
		else if (delta > 0) {
			state = State.HAI_NGHIEM;
			x1 = (-b+Math.sqrt(delta))/(2*a);
			x2 = (-b-Math.sqrt(delta))/(2*a);
		} else if (delta == 0) {
			state = State.NGHIEM_KEP;
			x1 = x2 = (-b)/(2*a);
		}
	}
	
	private void giaiPhuongTrinhBacMot(){
		if (b == 0 && c == 0) state = State.VO_SO_NGHIEM;
		else if (b == 0 && c != 0) state = State.VO_NGHIEM;
		else if (b != 0) {
			state = State.MOT_NGHIEM;
			x1 = -c/b;
		}
	}
	
	public double getX1() {
		return x1;
	}
	
	public double getX2() {
		return x2;
	}

```

##Áp dụng tiêu chuẩn MCDC
* Phân tích: với bài toán như trên có các hệ số đầu vào là a, b, c.
* Khi bộ số được nhập thì ta sẽ lần lượt kiểm tra từ hệ số cao nhất là a rồi đến b và c.
* Ta có bảng

\#  | C1 | C2 | C3 | C4 | C5 | C6 | output
----|----|----|----|----|----|----|------------
TC1 | T  | T  | F  | F  | -  | -  | vô nghiệm
TC2 | T  | F  | T  | F  | -  | -  | 2 nghiệm
TC3 | T  | F  | F  | T  | -  | -  | nghiệm kép
TC4 | F  | -  | -  | -  | T  | F  | vô số nghiệm
TC5 | F  | -  | -  | -  | F  | T  | Vô nghiệm
TC6 | F  | -  | -  | -  | F  | F  | Có nghiệm


sử dụng Kỹ thuật kiểm thử biên:
1. phù hợp với bài toán tính chuỗi tổng, chuỗi tích
2. gọn, nhẹ tương xứng với dung lượng code sinh ra
3. bao quát hết được các trường hợp test

##Unit Test cho các ca kiểm thử
```java
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
```


kiểm tra độ bao phủ sử dụng EclEmma trả về kết quả 72% (ảnh BT2/dobaophu.png).
sơ đồ khối sử dụng công cụ draw.io (ảnh BT2/PhuongTrinhBacHai.png).

BT3: MCDC bao phủ cao hơn với các ca kiểm thử, All - DU - Paths cụ thể hơn cho từng luồng data. (ảnh BT3/).
	