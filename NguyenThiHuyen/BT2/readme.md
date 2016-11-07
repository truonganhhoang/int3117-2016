Bài toán: kiểm tra xem 1 năm có phải năm nhuận không
- Năm chia hết cho 4 và không chia hết cho 100 hoặc chia hết cho 400 thì năm đó là năm nhuận

Cách làm:
- hàm Nhap(): nhập vào 1 năm bất kỳ
-hàm kiemTra(int year): kiểm tra năm vừa nhập có phải là năm nhuận không

Tiêu chuẩn MDCD
Xét điều kiện if (year%4 == 0 && year%100 != 0) || (year%400 == 0)


|No.|  year%400 |  year%4 |  year%100 | Kết quả
|---|-----------|---------|-----------|:-------:
| 1 |      T    |      -  |       -   |    T
| 2 |      F    |      T  |       F   |    T
| 3 |      F    |      T  |       T   |    F
| 4 |      F    |      F  |       -   |    F

(- : không quan tâm đến giá trị của ô đấy là True hay false )
