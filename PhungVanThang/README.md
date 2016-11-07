##Mô tả bài toán
	*Kiểm chứng xem ba cạnh có tạo thành một tam giác hay không!
	*Với input là các hệ số a,b,c

##Phương thức cần kiểm thử
 ```java
	public class Triangle {
		public boolean not(int a,int b, int c){
			
			if(a>=b && b>c){
				if(a < (b+c)){
					return true;
				}
				else return false;
			}
			else return false;
			}
		public boolean isoTriangle(int a,int b,int c){
			if(not(a,b,c)==true){
				if(a==b){
					return true;
				}
				else return false;
			}
				else return false;
			}
}

```

##Áp dụng tiêu chuẩn MCDC
    *Phân tích:Bài toán là đưa các hệ số a,b,c
    *Khi các bộ số được nhập ta sẽ lần lượt kiểm tra các kiểm thử

\#  | C1 | C2 | C3 | C4 | C5 | C6 | C7 | C8 output
----|----|----|----|----|----|----|------------
TC1 | T  | T  | F  | F  | -  | -  | 
TC2 | T  | F  | T  | F  | -  | -  |
TC3 | T  | F  | F  | T  | -  | -  | 
TC4 | F  | -  | -  | -  | T  | F  | 
TC5 | F  | -  | -  | -  | F  | T  | 
TC6 | F  | -  | -  | -  | F  | F  | 
TC7 | F  | -  | -  | -  | F  | F  | 
TC8 | F  | -  | -  | -  | F  | F  | 
	
##Sử dụng phương pháp kiểm thử biên mạnh:
	1.Khái quát được các trường hợp xảy ra.
	2.Thời gian xử lý nhanh và chính xác.
	3.Phù hợp với bài toán kiểm thử có là tam giác hay không?
	4.Lượng testcase ngắn gọn.
##Unit Test cho các ca kiểm thử
```java
	@Test
	public void test1() {
		Triangle A = new Triangle();
		boolean result = A.not(5,4,3);
		assertEquals(true, result);
		
	}
	
	/* BT3: Kiem tra bien */

	
	@Test
	public void test2() {
		Triangle A = new Triangle();
		boolean result = A.not(1,1,1);
		assertEquals(false, result);
		
	}
	
	@Test
	public void test3() {
		Triangle A = new Triangle();
		boolean result = A.not(0,0,0);
		assertEquals(false, result);
		
	}
	
	@Test
	public void test4() {
		Triangle A = new Triangle();
		boolean result = A.not(99,99,99);
		assertEquals(false, result);
		
	}
	
	@Test
	public void test5() {
		Triangle A = new Triangle();
		boolean result = A.not(1,0,0);
		assertEquals(false, result);
		
	}
	
	@Test
	public void test6() {
		Triangle A = new Triangle();
		boolean result = A.not(1,1,0);
		assertEquals(false, result);
		
	}
	
	@Test
	public void test7() {
		Triangle A = new Triangle();
		boolean result = A.not(0,0,1);
		assertEquals(false, result);
		
	}
	
	@Test
	public void test8() {
		Triangle A = new Triangle();
		boolean result = A.not(1,0,1);
		assertEquals(false, result);
		
	}
```

Bài tập tuần 4
	Độ bao phủ: Sử dụng EclEmma Java Code Coverage 2.3.3 (Eclipse Tools)
	Kết quả
		-Test coverage detail (BT3/coverage.png/)
 Đường đi với tiêu chuẩn All-DU-Paths cho biến c
1-2-4-5-7-8-9-10
1-2-4-5-7-8-9-10-11
(BT3/kiemtratamgiaca-all-du-paths.png/)