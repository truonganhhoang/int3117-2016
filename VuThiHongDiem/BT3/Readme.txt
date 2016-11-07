      0.	public boolean ham(int n) {                                                                 
      1.		int tong = 0;
      2.		int i = 0;
      3.		while (n > 0) {
      4.			tong += n % 10;
			n = n / 10;
			i++;
		}
      5.		boolean result = false;
      6.		if (i < 5)
      7.			return result;
      8.		if ((tong % 3 == 0 || tong % 4 == 0) && tong % 2 == 0) {
      9.			result = true;
		}
     10.		return result;
	  }


 
All-DU-Paths vo´i biê´n trong:
0-1-2-3-4-5-6-7-8-9-10
All-DU-Paths vo´i biê´n result:
0-1-2-3-4-5-6-7-8-9-10
All-DU-Paths vo´i biê´n i:
0-1-2-3-4-5-6-7-8-9-10

So sánh v?i áp d?ng MCDC:

All-DU-Path:	
-Bao ph? lu?ng d? li?u	
-Quan tr?ng t?i vi?c l?a ch?n du?ng di v?i
MCDC:
-Bao phu? luô`ng diê`u khiê?n	
 m?c tiêu bao ph? các c?p gán (definition) 
 và dùng (use) d? li?u.
 S? d?ng thông tin def-use và tiêu chu?n 
 c? th? d? nh?n du?c các du?ng di c? th? 
 trong d? th? CFG,t? dó xác d?nh các ca 
 ki?m th?  |Xét m?i t? h?p có d? các ca ki?m th?
 d? ki?m tra m?i di?u ki?n có 
 th? ?nh hu?ng d?n k?t qu? c?a bi?u th?c di?u ki?n 
 ch?a nó ,Bao ph? du?ng di t?t nhung có nhi?u du th?a.
 Xác d?nh s? ca ki?m th? d?a vào du?ng di th?a mãn 
 tiêu chu?n l?a ch?n,yêu c?u s? ca ki?m th? gi?ng bao
 ph? di?u ki?n/quy?t d?nh

K?t lu?n

MCDC có d? bao ph? cao, du?c áp d?ng cho Unit testing, 
ch? y?u ch? s? d?ng cho các d? án quy mô r?t l?n ho?c 
d?c bi?t quan tr?ng, dòi h?i d? chính xác tuy?t d?i 
nhu công nghi?p ô tô, hàng không, vu tr?... 
All-DU-Path khá ph?c t?p n?u bài toán có nhi?u bi?n
