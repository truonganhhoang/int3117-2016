# Bài tập tuần 7

## Áp dụng tiêu chuẩn kiểm thử All-DU-Path cho chương trình ở BT2.
* CFG của hàm *neigbors*
![cfg](https://github.com/ducanhk58uet/int3117-2016/blob/master/LeDucAnh/BT3/screenshots/cfg.PNG)

* c-use toàn cục cho biến dx: đỉnh 10 (được gán ở đỉnh 2)
* Đường đi đơn giản: 2-3-4-10
* Đường đi thỏa mãn All-defs cho biến dx:
 - 1-2-3-4-5-6-7-8-5-10-3-11
 - Với p-uses 1-2-3-11

* Đường đi với tiêu chuẩn All-DU-Paths cho biến dx:
 - 2-3-4-5-10
 - 2-3-4-5-6-7
 
* Áp dụng tiêu chuẩn trên, với w=100; h=100, ta ước lượng được giá trị Point(20,30) đi qua các đỉnh.

## So sánh và rút ra nhận xét về All-DU-Path và MCDC.
### So sánh
\# | Tiêu chí | MCDC | All-DU-Paths 
-- |----------|--------|--------
1. | Ý tưởng | abc | def       


### Nhận xét
