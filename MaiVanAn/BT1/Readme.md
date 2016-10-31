Mai Văn An - 13020001
Nâng cấp BT tuần 1:
- Mô tả bài toán: Nhập vào một số n, đầu ra là tổng các số chẵn dương nhỏ hơn n.
(ví dụ nhập n =10 thì sẽ tính tổng 0+2+4+6+8+10 = 30)
- Các ca kiểm thử: Cho n giá trị cực tiểu, cận cực tiểu, giá trị cực đại và giá trị âm.
- Sử dụng Kiểm thử biên mạnh : 
	+ Do hàm tính tổng các số chẵn dương nhỏ hơn số n cho trước nên tăng giá trị biên lớn nhất và thử các giá trị đặc biệt.
	+ Biên Min cho giá trị -10000 với kết quả kì vọng là = 0.
	
- Khi cho n = 100000 thì kết quả ra âm. Lí do: Kiểu trả về của Kết qủa là int.
- Sửa lại kiểu trả về là long.

Độ bao phủ dòng lệnh:
<br>
<img src="https://github.com/longdt03/int3117-2016/blob/master/MaiVanAn/BT1/coverage.JPG" />

<br>
<img src="https://github.com/longdt03/int3117-2016/blob/master/MaiVanAn/BT1/coverage_report.JPG" />

Sơ đồ khối:
<br>
<img src="https://github.com/longdt03/int3117-2016/blob/master/MaiVanAn/BT1/tinhtong.JPG"/>
