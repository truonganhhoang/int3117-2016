# Bài tập tuần 7

## Mô tả bài toán

- Chương trình kiểm số chia hết cho 2 và 3 hoặc 5 rồi tính tổng các số chia hết cho số đó trong khoảng 1-100

## Code

<img src="https://github.com/hoangbd58/int3117-2016/blob/master/BuiDangHoang/BT3/ctrinh.png" />

## Đồ thị chương trình
<img src="https://github.com/hoangbd58/int3117-2016/blob/master/BuiDangHoang/BT3/dothi.png" />

## Kiểm thử áp dụng All-DU-Path

### All-DU-Path của number : 

- 1,2,3(d),4,5(u),6,20,21 ứng với number = 101
- 1,2,3(d),4,5(u),7,8(u),9,10,11(c),12,13,14,15,16,20,21 ứng với number = 30
- 1,2,3(d),3,4,5(u),7,8(u),17,18,19,20,21 ứng với number = 7

## Nhận xét
- MCDC chặt chẽ hơn về bao phủ nhánh (branch), khi các điều kiện đơn chắc chắn sẽ được thực thi ít nhất một lần.
- All-DU-Path giúp kiểm tra bao phủ dòng lệnh (statement) rất tốt, vì để sinh ra được các ca kiểm thử thì ta cần dựa vào đồ thị chu trình   của chương trình
- All-DU-Path hỗ trợ kiểm tra cách các dòng dữ liệu chạy trong chương trình.
