BÁO CÁO BÀI TẬP TUẦN 5

Mô tả:

+ Chương trình viết bằng Java, test bằng JUnit
+ Chương trình là tìm số tam giác cân trong một mảng các đối tượng tam giác

Hàm cần kiểm thử:
+ public int total_isosceles_triangle(ArrayList<Triangle> arrayListTriangle){
}

Biểu thức Branch: 

+ (edge1 > 0 && edge2 > 0 && edge3 > 0) && ((edge1 + edge2 > edge3) && (edge1 + edge3 > edge2) && (edge3 + edge2 > edge1)) && ((edge1 == edge3) || (edge1 == edge2) || (edge3 == edge2))

Áp dụng tiêu chuẩn MCDC, ta có bảng sau:
![MCDC](/screenshots/mc_dc.png)

Unit tests cho các ca kiểm thử đã tính trên: 

+ public void test_mang_rong()
+ public void test_mang_null()
+ public void test_mang_ket_qua_dung()
+ public void test_mang_ket_qua_sai_chua_so_am()

Đo mức độ bao phủ

![Coverage](/screenshots/coverage.png)

![Code](/screenshots/code_coverage.PNG)