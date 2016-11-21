# Bài tập 3 :
## Áp dụng tiêu chuẩn kiểm thử All-DU-Path cho chương trình ở BT2
### Mã nguồn chương trình
- ![alt text](https://raw.githubusercontent.com/nhahv0902/int3117-2016/master/HoangVanNha/BT3/image/program.png "Image Program")
### Chu trình của chương trình
- ![alt text](https://raw.githubusercontent.com/nhahv0902/int3117-2016/master/HoangVanNha/BT3/image/luong_dieu_khien.png "Image chu trình")

### Đo mức độ bao phủ  
- ![alt text](https://raw.githubusercontent.com/nhahv0902/int3117-2016/master/HoangVanNha/BT2/image/Coverage-3%20(2).png "Image độ bao phủ")

- Theo tiên chuẩn kiểm thử All-DU-PATH ta có các luồng đi với biến: numberStart
- Luồng điều khiển xuất phát từ dòng thứ 2
-  2 - 4 (use) - 5
    +  input: 0 
    +  output (-1, -1)
-  4 - 7(use) - 8 (def)- 15(use) -28
    +  input: -4
    +  output: (3, 5)
-  4 - 7(use) - 8 (def)- 15(use) -17 (use)- 18 (use)- 20 (use) - 23
    +  input: 8
    +  output: (6, 10)
-  4 - 7 -  15 (use) -  17 (use)- 18 (use) -28
    +  intput: 5
    +  output: (-1, -1)

 ### Nhận xét so sánh và rút ra nhận xét về All-DU-Path và MCDC
- MCDC chặt chẽ hơn về bao phủ nhánh, khi các điều kiện đơn chắc chắn sẽ được thực thi ít nhất một lần. 
- All-DU-Path giúp kiểm tra bao phủ dòng lệnh, vì để sinh ra được các ca kiểm thử thì ta cần dựa vào đồ thị chu trình của chương trình.  
- All-DU-Path hỗ trợ kiểm tra cách các dòng dữ liệu chạy trong chương trình. 
- All-Du-Path cần ít test case hơn MCDC, các test case rõ ràng và ít cần phải suy luận hơn MCDC
- Nhưng với các biểu thức điều kiện phức hợp thì dùng MCDC sẽ chặt chẽ hơn so với All-DU-Path
