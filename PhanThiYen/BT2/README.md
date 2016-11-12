#Mô tả bài toán
----
##*Tính tổng các số tự nhiên chia hết cho 10 từ 0 đến n bất kì cho trước*

1. Input: đầu vào là một số nguyên n cho trước.
2. Output: Trả về kết quả của tổng các số chia hết cho 10
3. Các TH xảy ra:

- Nếu n < 0  trả về kết quả là -1
- Nếu n >0 và trong dãy có các sô vừa chia hết cho 2 và 5 hoặc chia hết cho 10 thì tính tổng các số đó.
- Ngược lại trả về 0.

----
##Chương trình 

```sh
	public int tinhTong(int n) {
		int i = 0;
		int result = 0;
		if (n < 0)
			return -1;
		while (i <= n) {
			if ((i % 2 == 0 && i % 5 == 0) || i % 10 == 0) {
				result += i;
			}
			i++;
		}
		return result;
	}
```
----

##Áp dụng tiêu chuẩn MCDC.

- Đặt điều kiện chương trình c1,c2... như trong hình vẽ.

 http://prntscr.com/d3cheb

- Xét tổ hợp điểu kiện C345(C3,C4,C5) ta có bảng sau:

| STT | C3 | C4 | C5 | Result |
|-----|----|----|----|--------|
| 1 | T | T | T | T |
| 2 | T | T | F | T |
| 3 | T | F | F | F |
| 4 | T | T | F | T |
| 5 | F | T | T | T |
| 6 | F | T | F | F |
| 7 | F | F | T | T |
| 8 | F | F | F | F |

----

- Xét tổ hợp điều kiện C12345 ta có bảng sau:

| Stt | C1 | C2 | C2345 | Result |
|-----|----|----|-------|--------| 
| 1 | T | - | - | -1 |
| 2 | F	| F | - | - |
| 3 | F | T | T | T |
| 4 | F | T | F | F |

##**Vậy tổng số testcase là 4+8=12.**

# Độ bao phủ

http://prntscr.com/d3ecmo
