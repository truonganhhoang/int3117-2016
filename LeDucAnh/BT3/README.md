# Bài tập tuần 7

## Áp dụng tiêu chuẩn kiểm thử All-DU-Path cho chương trình ở BT2 (sử dụng MCDC).
* CFG của hàm *neigbors*
![cfg](https://github.com/ducanhk58uet/int3117-2016/blob/master/LeDucAnh/BT3/screenshots/cfg.PNG)

* c-use toàn cục cho biến dx: đỉnh 10 (được gán ở đỉnh 2)
* Đường đi đơn giản: 2-3-4-10
* Đường đi thỏa mãn All-defs cho biến dx:
- 1-2-3-4-5-6-7-8-5-10-3-11
- Với p-uses 1-2-3-11
