#Bài toán
Tìm ước chung lớn nhất của 2 số a và b
- Ngôn ngữ: Javascript
- Testing framework: Mocha

#Chạy chương trình:
```javascript
npm install mocha 
```
```javascript
mocha 
```

#Phương pháp kiểm thử
Phương pháp kiểm thử tốt nhất: Kiểm thử biên mạnh kết hợp kiểm thử lớp tương đương, vì: 
- vì các biến là vật lý và độc lập với nhau
- cần bắt ngoại lệ cho trường hợp vượt quá giá trị của kiểu Number
- kiểm thử được hết các trường hợp có thể xảy ra với 2 biến đầu vào: lớn hơn, nhỏ hơn, bằng nhau

#Áp dụng kiểm thử
##Kiểm thử biên mạnh
- Test với các giá trị Number.MAX_SAFE_INTEGER - 1, Number.MAX_SAFE_INTEGER, Number.MAX_SAFE_INTEGER + 1
- Test với các giá trị Number.MIN_SAFE_INTEGER - 1, Number.MIN_SAFE_INTEGER, Number.MIN_SAFE_INTEGER + 1
- Test với giá trị bình thường <br>
Trong Javascript, các giá trị max và min của kiểu Integer lần lượt là <br>
```javascript
Number.MAX_SAFE_INTEGER = 2^53 - 1 
Number.MIN_SAFE_INTEGER = -(2^53 - 1) 
```
Khi cố tình nhập vào số vượt quá đoạn [min, max] chương trình cần phải trả về false

| Case#| a  | b  | Expected Output
| ------|----------------|----------------|------------
|   1  | 2 | Number.MAX_SAFE_INTEGER | 1
|   2  | 2 | Number.MAX_SAFE_INTEGER-1 | 2
|   3  | Number.MAX_SAFE_INTEGER | Number.MAX_SAFE_INTEGER | false
|   4  | 2 | Number.MIN_SAFE_INTEGER | 1
|   5  | 2 | Number.MIN_SAFE_INTEGER-1 | false
|   6  | 2 | Number.MIN_SAFE_INTEGER+1 | 2
|   6  | 14 | 7                 | 7

##Kiểm thử tương đương
Xác định các lớp tương đương
- R1: a < b với a, b thuộc Z
- R2: a > b với a, b thuộc Z
- R3: a = b với a, b thuộc Z
- R4: a, b không phải là số nguyên

|      | a  | b  | Expected Output
| -----|----|----|-----------------
| TE1  | 12 | 16 | 4
| TE2  | 75 | 20 | 5
| TE3  | 2 | 2 | 2
| TE4  | 3 | 3.2 | false

#Kết quả của việc áp dụng
- Kiểm tra được trường hợp cần bắt ngoại lệ (vượt quá kiểu Number), các test case trở lên rõ ràng hơn
- Giúp chương trình thêm chặt chẽ đầy đủ hơn

#Đo mức độ bao phủ 
![Coverage](https://raw.githubusercontent.com/fiser-khoanv11/int3117-2016/master/NguyenThiTrang/BT1/Coverage.JPG)

#Đồ thị chương trình
![Flowchart](https://raw.githubusercontent.com/fiser-khoanv11/int3117-2016/master/NguyenThiTrang/BT1/FlowChart.JPG)
