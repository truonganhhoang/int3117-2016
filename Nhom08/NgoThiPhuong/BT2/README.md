#Bài tập 2

##Mô tả bài toán:
- Đếm tất cả các kí tự trong chuỗi không bao gồm dấu cách.

##Hàm cần kiểm thử


	public int demSoKyTu(String a) {
		int i = 0; 
		int total = 0;
		int len = a.length();
		while(i < len) {
			if(((a.charAt(i) >= 'A') && (a.charAt(i) <= 'Z')) 
				|| ((a.charAt(i) >= 'a') && (a.charAt(i) <= 'z'))) {
					total ++;
				}
			i++;
		}
		return total;
	}


#### Các điều kiện:
  
 - ĐK1: (a.charAt(i) >= 'A')
 - ĐK2: (a.charAt(i) <= 'Z')
 - ĐK3: (a.charAt(i) >= 'a')
 - ĐK3: (a.charAt(i) <= 'z')


#### Biểu thức điều kiện: `Branch = (ĐK1 && ĐK2) ||(ĐK3 && ĐK4)`

##Áp dụng MCDC

###Bảng điều kiện đầy đủ


| STT            | ĐK1              | ĐK2            | ĐK3          | ĐK4       | Branch        |
| ---------------| ---------------- | ---------------| -------------| ----------| --------------|
| 1 | T | T | T | T | T |
| 2 | T | T | T | F | T |
| 3 | T | T | F | T | T |
| 4 | T | F | T | T | T |
| 5 | T | T | F | F | T |
| 6 | T | F | T | F | F |
| 7 | T | F | F | T | F |
| 8 | T | F | F | F | F |
| 9 | F | T | T | T | T |
| 10 | F | T | T | F | F |
| 11 | F | T | F | T | F |
| 12 | F | F | T | T | T |
| 13 | F | F | T | F | F |
| 14 | F | T | F | F | F |
| 15 | F | F | F | T | F |
| 16 | F | F | F | F | F |

###Lấy ra các điều kiện ảnh hưởng độc lập tới kết quả

| STT            | ĐK1              | ĐK2            | ĐK3          | ĐK4       | Branch        |
| ---------------| ---------------- | ---------------| -------------| ----------| --------------|
| 2 | T | T | T | F | T |
| 3 | T | T | F | F | T |
| 4 | F | T | T | F | F |
| 5 | T | F | F | T | F |

##Mức độ bao phủ
![result](https://github.com/phuongnt58/int3117-2016/blob/master/Nhom08/NgoThiPhuong/BT2/do_bao_phu.PNG)


