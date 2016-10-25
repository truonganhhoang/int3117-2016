##Báo cáo bài tập tuần 5  
#Sử dụng tiêu chuẩn MCDC có bộ ca kiểm thử  
| # | A | B | C | D | E |  
|---|---|---|---|---|---|  
| 1 | T | T | F | F | any |  
| 2 | T | T | T | F | any |  
| 3 | T | T | F | T | any |  
| 4 | T | F | any | any | F |  
| 5 | F | T | any | any | T |  
Với A tương ứng với điều kiện a>0  
Với B : b<10  
Với C : a==c  
Với D : b==c  
Với E : a%2==0  
#Xây dựng các ca kiểm thử  
Ca kiểm thử 1: T-T-F-F-T => Kết quả = 0   
       	@Test  
       	public void test1() {  
       	int result = number.foo(6,7,8);  
       	assertEquals(0, result, 0.0);  
	}   
Ca kiểm thử 2: T-T-T-F-F => Kết quả #0    
	@Test  
	public void test2() {  
	    int result = number.foo(6,7,6);  
	    assertEquals(11, result, 0.0);  
	}  
Ca kiểm thử 3: T-T-F-T-T => Kết quả #0  
	@Test  
	public void test3() {  
	    int result = number.foo(5,7,7);  
	    assertEquals(13, result, 0.0);  
	}    
Ca kiểm thử 4: T-F-T-F-F => Kết quả = 0  
	@Test  
	public void test4() {  
	    int result = number.foo(5,11,5);  
	    assertEquals(0, result, 0.0);  
	}  
Ca kiểm thử 5: F-T-T-F-T => Kết quả = 0  
	@Test  
	public void test5() {  
	    int result = number.foo(-1,5,5);  
	    assertEquals(0, result, 0.0);  
	}    
#Kết quả test  
http://imgur.com/a/zSquA
#Mức độ bao phủ
http://imgur.com/a/MyUik


