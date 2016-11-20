#Bài tập 2
1. Bài toán
	- Bài toán tính ước số chung lớn nhất của 2 số nguyên.
	- Tham số đầu vào là 2 số a và b, output của bài toán là ước chung lớn nhất của a và b. Nếu a và b không có ước chung hoặc a = b = 0, bài toán sẽ trả về kết quả 0	
2. Kiểm thử
	- Áp dụng tiêu chuẩn MCDC vào bài toán cho câu lệnh có 3 điều kiện:
	```Java
    if (a == b || a != 0 && b == 0) {
            return Math.abs(a);
    }
    ```
    Đặt 
    
    	boolean condition1 = (a == b);
    
    	boolean condition2 = (a == 0);
        
        boolean condition3 = (b == 0);
    
    
	Ta có bảng chân lý sau:
    
    |   | Condition1 | Condition2 | Condition3 | Outcome |
    |---|------------|------------|------------|---------|
    |1  | T          |T           |T           |T        |
    |2  | T          |T           |F           |T        |
    |3  | T          |F           |T           |T        |
    |4  | T          |F           |F           |T        |
    |5  | F          |T           |T           |F        |
    |6  | F          |T           |F           |F        |
    |7  | F          |F           |T           |T        |
    |8  | F          |F           |F           |F        |
    
	- Dựa vào bảng chân lý ta xác định 3 trường hợp 1, 4, 6, 8 là đủ để bao phủ các cách kết hợp theo MCDC.
	- Ta có 4 ca kiểm thử:
	- 
	|   | a   | b   | Expected Result |
    |---|-----|-----|-----------------|
    |TC1| 0   |0    |0                |
    |TC2| 5   |5    |5                |
    |TC3| 0   |5    |5                |
    |TC4| 14  |24   |2                |
    
3. Kết quả
	- Độ bao phủ đo được là 100%
	
	![alt tag](https://github.com/longdt03/int3117-2016/blob/master/DangThanhLong/BT2/TestCoverageReport1.PNG)
    
    ![alt tag](https://github.com/longdt03/int3117-2016/blob/master/DangThanhLong/BT2/TestCoverageReport2.PNG)