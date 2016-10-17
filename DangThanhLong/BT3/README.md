#Bài tập 3
1. Bài toán
	- Bài toán tính ước số chung lớn nhất của 2 số nguyên.
	- Tham số đầu vào là 2 số a và b, output của bài toán là ước chung lớn nhất của a và b. Nếu a và b không có ước chung hoặc a = b = 0, bài toán sẽ trả về kết quả 0	
	- Bài tập tuần này đã tối ưu 1 câu lệnh điều kiện
2. Kiểm thử
	- Áp dụng tiêu chuẩn kiểm thử All-DU-Path vào bài toán
	
		+ 1 public int findGreatestCommonDivisor(int a, int b) {        
		+ 2     if(a == b || a != 0 && b == 0) {
		+ 3         return Math.abs(a);
		+ 4     }             
		+ 5     if(b != 0 && a == 0) {
		+ 6         return Math.abs(b);
		+ 7     }        
		+ 8     int temp = 0;
		+ 9     while(b != 0) {
		+ 10         temp = a % b;
		+ 11         a = b;
		+ 12         b = temp;
		+ 13     }
		+ 14     return a;
		+ 15 }   

	- Đường đi DU-Path của biến a:
		+ 1->2->3
		+ 1->2->5->8->10->11->14
	- Đường đi DU-Path của biến b:
		+ 1->2->5->6
		+ 1->2->5->8->9->10->11->12->14
		
	- Từ đường đi DU-Path ta có các bộ kiểm thử tương ứng
		+ a = b = 5 => Expected result = 5
		+ a = 5 và b = 0 => Expected result = 5
		+ b = 5 và a = 0 => Expected result = 5
		+ a = 14 và b = 4 => Expected result = 2
3. Kết quả
	- Độ bao phủ đo được là 100%
	
	![alt tag](https://github.com/longdt03/int3117-2016/blob/master/DangThanhLong/BT3/TestCoverage.PNG)