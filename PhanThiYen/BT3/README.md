#Mô tả bài toán: Áp dụng tiêu chuẩn kiểm thử All-DU-Path
----
##*Tính tổng các số tự nhiên chia hết cho 10 từ 0 đến n bất kì cho trước*

1. Input: đầu vào là một số nguyên n cho trước.
2. Output: Trả về kết quả của tổng các số chia hết cho 10
3. Các TH xảy ra:

- Nếu n < 0  trả về kết quả là -1
- Nếu n >0 và trong dãy có các sô vừa chia hết cho 2 và 5 hoặc chia hết cho 10 thì tính tổng các số đó.
- Ngược lại trả về 0.

----
##Độ bao phủ

http://prntscr.com/d3ecmo

##Chương trình

```sh
 public int tinhTong(int n) {
	(1)	int i = 0; 
	(2)	int result = 0;
	(3)	if (n < 0)
	(4)		return -1;
	(5)	while (i <= n) {
	(6)		if ((i % 2 == 0 && i % 5 == 0) || i % 10 == 0) {
	(7)			result += i;
	(8)		}
	(9)		i++;
		}
	(10)	return result;
	}
```
----
##**Đồ thị luồng dữ liệu cho chương trình** 

http://prnt.sc/d3cpcn

1. Áp dụng tiêu chuẩn kiểm thử All-DU-Path cho biến i

- 1, 2, 5, 6, 7, 8, 9.

```sh
 public int tinhTong(int n) {
	(1)	int i = 0; 
	(2)	int result = 0;
	(3)	if (n < 0)
	(4)		return -1;
	(5)	while (i <= n) {
	(6)		if ((i % 2 == 0 && i % 5 == 0) || i % 10 == 0) {
	(7)			result += i;
	(8)		}
	(9)		i++;
		}
	(10)	return result;
	}
```
----

2. Áp dụng tiêu chuẩn kiểm thử All-DU-Path cho biến result

- 2, 6, 8

```sh
 public int tinhTong(int n) {
	(1)	int i = 0; 
	(2)	int result = 0;
	(3)	if (n < 0)
	(4)		return -1;
	(5)	while (i <= n) {
	(6)		if ((i % 2 == 0 && i % 5 == 0) || i % 10 == 0) {
	(7)			result += i;
	(8)		}
	(9)		i++;
		}
	(10)	return result;
	}
```
----
3. Áp dụng tiêu chuẩn kiểm thử All-DU-Path cho biến n

- 1, 2, 3, 4

- 1, 2, 3, 5, 6, 7, 8, 9, 10

----

#So sanh hai tiêu chuẩn MCDC và All-DU-Path cho bài toán này 

- Cả hai đều là kĩ thuật kiểm thử hộp trắng.
- Tiêu chuẩn kiểm thử All-DU-Path là kiểm thử luồng dữ liệu của các biến  nên xác định dễ dàng hơn. Tuy vậy thì tiêu chuẩn MC/DC thì chặt chẽ hơn có nhiều ca kiểm thử hơn.


