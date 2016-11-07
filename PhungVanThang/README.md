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
    *Phân tích:Ta cùng xét chương trình trên với 2 lệnh if
	*với lệnh if thứ nhất có tổ hợp 2 điều kiện con (a>=b )và (b>c)
	*với lệnh if thứ 2 có điều kiện (not(a,b,c)==true)
	*với lệnh if thứ 3 có điều kiện (a==b)
    *Ta có bảng sau
	*C1:(a>=b )
	*C2: (b>c)
	*C3:(not(a,b,c)==true)
	*C4:(a==b)

\#  | C1 | C2 | C3 | C4 |     | output
----|----|----|----|----|----|----|------------
TC1 | T  | T  | -  | -  | -  | T  
TC2 | T  | T  | -  | -  | -  | T  
TC3 | T  |  F |  - | -  | -  | F  
TC4 | F  | T  | -  | -  | -  | F  
TC5 | T  | T  | F  | -  | -  | F  
TC6 | T  | T  | T  | -  | -  | T   	


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

## Kết quả:
![co_incode](https://github.com/ducanhk58uet/int3117-2016/blob/master/PhungVanThang/BT3/coverage.png)
	Độ bao phủ: Sử dụng EclEmma Java Code Coverage 2.3.3 (Eclipse Tools)
	Kết quả
		-Test coverage detail  BT3/BT3 - coverage.png
 Đường đi với tiêu chuẩn All-DU-Paths cho biến c
1-2-4-5-7-8-9-10
1-2-4-5-7-8-9-10-11
BT3/BT3 - kiemtratamgiaca-all-du-paths.png
![co_incode](https://github.com/ducanhk58uet/int3117-2016/blob/master/PhungVanThang/BT3/kiemtratamgiaca-all-du-paths.png)
##Nhận xét: giữa All DU Path và MCDC có sự khác biệt về cách thực hiện qua đó có những hiệu quả khác nhau
*Với MCDC tất cả các trường đều được test có nghĩa là khi đó tất cả các đường đi đều được bao phủ.
	* Phải thực hiện nhiều ca kiểm thử để hoàn thành tiêu chuẩn này.
* Với All DU Path thì tập trung vào test cho đường đi của một biến.
	* Cần thực hiện các ca kiểm thử ít hơn với mục tiêu cụ thể.