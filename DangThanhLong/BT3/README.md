#Bài tập 3
1. Bài toán
	- Bài toán tính ước số chung lớn nhất của 2 số nguyên.
	- Tham số đầu vào là 2 số a và b, output của bài toán là ước chung lớn nhất của a và b. Nếu a và b không có ước chung hoặc a = b = 0, bài toán sẽ trả về kết quả 0	
	- Bài tập tuần này đã tối ưu 1 câu lệnh điều kiện
2. Kiểm thử
	- Áp dụng tiêu chuẩn kiểm thử All-DU-Path vào bài toán
	
    ```java
		public int findGreatestCommonDivisor(int a, int b) {        
		    if(a == b || a != 0 && b == 0) {
		        return Math.abs(a);
		    }             
		    if(b != 0 && a == 0) {
		        return Math.abs(b);
		    }        
		    int temp = 0;
		    while(b != 0) {
		        temp = a % b;
		        a = b;
		        b = temp;
		    }
		    return a;
		}   
    ```
	
	- Đồ thị đường đi
	
    ![alt tag](https://github.com/longdt03/int3117-2016/blob/master/DangThanhLong/BT3/Diagram.png)
    
	- Đường đi DU-Path của biến a:
		+ A->B->C
		+ A->B->D->E
	- Đường đi DU-Path của biến b:
		+ A->B->D->E
		+ A->B->D->F->H->G
		
	- Từ đường đi DU-Path ta có các bộ kiểm thử tương ứng
		+ a = b = 5 => Expected result = 5
		+ a = 5 và b = 0 => Expected result = 5
		+ b = 5 và a = 0 => Expected result = 5
		+ a = 14 và b = 4 => Expected result = 2
3. Kết quả
	- Độ bao phủ đo được là 100%
	
	![alt tag](https://github.com/longdt03/int3117-2016/blob/master/DangThanhLong/BT3/TestCoverage.PNG)

4. Nhận xét
	- Sử dụng Kiểm thử All-DU-Path và MCDC trong bài toán này đều có số ca kiểm thử và độ bao phủ như nhau. Tuy nhiên sử dụng kiểm thử All-DU-Path thực hiện dễ dàng hơn do có sơ đồ luồng.