# Bài toán 
Kiểm tra tính chia hết của tổng dãy số
- Input: một dãy số
- Output: gọi sum = tổng của dãy số (nếu dãy rỗng thì sum = 0)
+ nếu sum chia hết cho cả 3 và 11 hoặc chia hết cho 7 thì trả về 1
+ nếu sum chia hết cho cả 2 và 5 hoặc 2 và 11 thì trả về 2
+ còn lại trả về false

# Chương trình

```
function checkSum(arr) {
	if (Array.isArray(arr) == false) return false;

	var sum = 0;
	for (var i = 0; i < arr.length; i++) {
		sum += arr[i];
	}

	if (((sum % 3 == 0) && (sum % 4 == 0)) || (sum % 7 == 0)) return 1;
	if (((sum % 5 == 0) || (sum % 9 == 0)) && (sum % 2 == 0)) return 2;
	return false;
}
```


# Áp dụng tiêu chuẩn MCDC
- Ta đặt các điều kiện của chương trình tương ứng với C1, C2... như ảnh dưới 
![block](https://raw.githubusercontent.com/fiser-khoanv11/int3117-2016/master/NguyenThiTrang/BT2/images/Block.JPG)
- Xét tổ hợp điều kiện C345 (C3 && C4) || C5
Ta có bảng sau:

|No.| C3 | C4 | C5 | C345 = (C3 && C4) // C5
|---|----|----|----|:--------------------------:
| 1 | T  | T  | T  |           T
| 2 | T  | T  | F  |           T
| 3 | T  | F  | T  |           T
| 4 | T  | F  | F  |           F
| 5 | F  | T  | T  |           T
| 6 | F  | T  | F  |           F
| 7 | F  | F  | T  |           T
| 8 | F  | F  | F  |           F


- Xét tổ hợp điều kiện C678 (C6 || C7) && C8
Ta có bảng sau:

|No.| C6 | C7 | C8 | C678 = (C6 // C7) && C8
|---|----|----|----|:--------------------------:
| 1 | T  | T  | T  |           T
| 2 | T  | T  | F  |           F
| 3 | T  | F  | T  |           T
| 4 | T  | F  | F  |           F
| 5 | F  | T  | T  |           T
| 6 | F  | T  | F  |           F
| 7 | F  | F  | T  |           F
| 8 | F  | F  | F  |           F


Thu gọn lại, ta có bảng tổ hợp của C345 và C678

|No.| C3 | C4 | C5 | C345 = (C3 && C4) // C5	| Thu gọn cho |
|---|----|----|----|:--------------------------:|-------------|
| 1 | T  | T  | F  |           T		| C3	      |
| 2 | T  | F  | T  |           T		| C5, C4      |
| 3 | T  | F  | F  |           F		| C5, C4      |
| 4 | F  | T  | F  |           F		| C3	      |



|No.| C6 | C7 | C8 | C678 = (C6 // C7) && C8	| Thu gọn cho |
|---|----|----|----|:--------------------------:|-------------|
| 1 | T  | F  | T  |           T		| C6	      |
| 2 | F  | T  | T  |           T		| C7,C8       |
| 3 | F  | T  | F  |           F		| C8          |
| 4 | F  | F  | T  |           F		| C6,C7	      |


Vậy ta có các trường hợp sau cho các khối C1, C2, C345, C678. Ta có bảng quyết định

|||||||
|:------:|----|----|----|----|---|
| C1     | T  | F  | F  | F  | F
| C2     | _  | T  | F  | T  | T
| C345   | _  | T  | T  | F  | F
| C678   | _  | _  | _  | F  | T
|||||||
| FALSE  | x  |    |    | x  | 
|  1     |    | x  | x  |    | 
| 2      |    |    |    |    | x

Vì C345 có 2 testcase có KQ là T và 2 testcase có kết quả là F, tương tự với C678

Vậy tổng số testcase = 1 + 1  + 2 + 4*2 = 12 test


# Đo mức độ bao phủ
![Coverage](https://raw.githubusercontent.com/fiser-khoanv11/int3117-2016/master/NguyenThiTrang/BT2/images/Coverage.JPG)

# Nhận xét:
Với chương trình này, dùng bao phủ quyết định là đơn giản nhất, vì các biểu thức điều kiện đều rõ ràng, không bị rơi vào các trường hợp đoản mạch (như chia cho 0...)
