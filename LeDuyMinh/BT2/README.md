**Bài tập tuần 5**

Mô tả chương trình:

 - Input: 2 số nguyên n, m bất kì.
 - Output: dãy các số nguyên tố thuộc [n, m].

Áp dụng tiêu chuẩn MC/DC:

 - if(n < 2 && m < 2)
Đưa về dạng tổng quát if(A and B), ta có 3 trường hợp:
A		T	T	F
B		T	F	T
Test	1	3	2

 - if((n >= 2 && m < 2) || (n < 2 && m >= 2))
Đưa về dạng tổng quát if((A and B) or (C and D)), ta có 8 trường hợp:
A		T	T	T	F	T	T	F	F
B		T	T	F	T	F	F	T	T
C		T	F	T	T	T	F	T	F
D		F	T	T	T	F	T	F	T
Test	0	0	0	0	0	4	1	0
(Vì A xung khắc C, B xung khắc D nên nhiều trường hợp không có bộ giá trị thỏa mãn)

Trong đó,

 - Test 0: Không có bộ giá trị nào thỏa mãn.
 - Test 1: n = -1, m = 1
 - Test 2: n =  4, m = 0
 - Test 3: n = -1, m = 9
 - Test 4: n =  2, m = 15

Vậy ta có 4 bộ test theo tiêu chuẩn MC/DC.

Đo mức độ bao phủ:
![Đo mức độ bao phủ](https://github.com/vutung189/int3117-2016/blob/master/LeDuyMinh/BT2/DoDoBaoPhu.png)

Với chương trình này, ta có thể áp dụng bao phủ dòng lệnh mà vẫn tạo được bộ test chất lượng như MCDC. Khi đó, ta chỉ có 3 bộ test 1, 2, 3 nhưng vẫn có độ bao phủ tương đương vì test 2 và 3 sau khi xử lí
thì giống bộ test 4 (n, m đều lớn hơn 1).