
## Description
Chương trình nhập số từ bàn phím so sánh số đó có bằng số đảo ngược của chính nó hay không. 
viết bằng java, unit test sử dụng thư viện junit trên eclipse

## Áp dụng phương pháp giá trị biên BVA
- CT nhận 1 biến đầu vào kiểu int là N.
- N có MXD: -2147483648 <= N <= 2147483647
- BVA chọn các giá trị sau: -2147483648, -2147483647, 0, 1, 2147483646, 2147483647

## BVA phù hợp vì:
- chương trình chỉ có duy nhất một biến đầu vào độc lập
- biến này bị chặn trong kiểu int -2147483648.. ...2147483647
- các ca kiểm thử cũng không tính đến chức năng của hàm. 
