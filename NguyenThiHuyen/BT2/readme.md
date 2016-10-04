Bài toán: kiểm tra xem 1 năm có phải năm nhuận không
- Năm chia hết cho 4 và không chia hết cho 100 hoặc chia hết cho 400 thì năm đó là năm nhuận

Cách làm:
- hàm Nhap(): nhập vào 1 năm bất kỳ
-hàm kiemTra(int year): kiểm tra năm vừa nhập có phải là năm nhuận không

Tiêu chuẩn MDCD
year%400 | year%4 | year%100 | Kết quả
      T  |    T   |    F     | T
      T  |    T   |    T     | T
      F  |    T   |    F     | T
      F  |    T   |    T     | F

Ðộ bao phủ câu lênh: 89.7%