
















Mô tả: Chương trình kiểm tra chữ số nguyên n được nhập vào bàn phím có là số nguyên tố không?
   Giới thiệu trương trình: 
  kiem_tra_snt(): Hàm xác nhận n có phải số nguyên tố hay k?
- Test.js: có 5 testcase vơi các trường hợp đúng.

 
 
 
 
  Phương pháp kiểm thử: 
   Giá trị biên 
   Lý do: Các gía trị đầu vào xác định là các mảng có biên là (a và b) với a,b là các giá trị điều kiện. Nên chọn kiểm thẻ giá trị biên có thể rút gọn thời gian và xác định giá trị kiểm thử dễ dàng. 
 
  Các test case với giá trị biên: 
    assert.equal(kiem_tra_snt(0), "Khong la so nguyen to!");
    assert.equal(kiem_tra_snt(1), "Khong la so nguyen to!");
    assert.equal(kiem_tra_snt(2), "La so nguyen to!");
    assert.equal(kiem_tra_snt(3), "La so nguyen to!");
    assert.equal(kiem_tra_snt(1231), "La so nguyen to!");

 các giá trị kiểm thử đều đúng!
 
 
 
 
 
 