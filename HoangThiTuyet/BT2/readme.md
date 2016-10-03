# BÀI TẬP 2
## Cho 1 dãy số, đếm xem có bao nhiêu bộ gồm 3 số thảo mãn là 3 cạnh của tam giác
+ Tam giác thường điều điện: (a+b)>c)and ((a+c)>b) and ((c+b)>a)
+ Tam giác cân điều kiện: ( a = b) or (b = c) or (a = c)
+ Tam giác đếu điều kiện: (a=b)and(a=c)
+ Tam giác vuông điều kiện (a * a = b * b + c * c) or (b * b = a * a + c * c) or (c * c = a * a + b * b)

## Các ca kiểm thử

1. Kiểm thử với dãy có ít hơn 3 phần tử
2. Kiểm thử các giá trị âm
3. kiểm thử không có cặp tam giác nào 

    |   |  (a+b)>c) | ((a+c)>b) |((c+b)>a)|
    |---|-----------|-----------|---------|
    | 1 |     F     |    T      |    T    |
    | 2 |     T     |    F      |    T    |
    | 3 |     T     |    T      |    F    |
    
4. Kiểm thử có tam giac thường
5. Kiểm thử có tam giác cân và đều
6. Kiểm thử có tam giác vuông

## Độ bao phủ 98,3% 
+ Còn 7 trường hợp chưa được bao phủ (em chưa xác định được).
