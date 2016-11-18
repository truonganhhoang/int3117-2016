Đinh Việt Cường - 13020051

Bài toán: đếm số kí tự là chữ (chữ hoa và chữ thường) trong 1 xâu bất kì.

Tính toán ca kiểm thử với MC/DC

Với vòng if thứ nhất: if (str == null || str.length() == 0) ta có bảng các giá trị:

                              (A)	        (B)
			      
Theo MCDC có bảng kết quả:

	Trường hợp		A	B	Result

	1	        	T	F	T

	2        		F	T	T

	3        		F	F	F

	4        		T	T	T  	=> trường hợp này không xảy ra

=> ta có các test case:

+ trường hợp xâu null

+ trường hợp xâu rỗng không có kí tự nào

+ trường hợp xâu có độ dài lớn hơn 0.

Với trường hợp xâu có độ dài lớn hơn 0 sẽ chạy vào trong else.

Trong else có lệnh while và vòng if thứ 2: 

if ((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122))

		(C)	          (D)               (E)	           (F)

Các trường hợp:

	Trường hợp		C	D	E	F		Result

	1	       		T	T	T	T		T	=> trường hợp này không xảy ra

	2	        	T	T	T	F		T

	3	        	T	T	F	T		T	=> trường hợp này không xảy ra

	4	        	T	F	T	T		T

	5				T	T	F	F		T

	6				T	F	T	F		F

	7				T	F	F	T		F	

	8	       		T	F	F	F		F	=> trường hợp này không xảy ra

	9				F	T	T	T		T

	10	      		F	T	T	F		F

	11	      		F	T	F	T		F	=> trường hợp này không xảy ra

	12	      		F	F	T	T		T

	13	       		F	T	F	F		F

	14				F	F	T	F		F

	15				F	T	F	F		F	=> trường hợp này không xảy ra

	16				F	F	F	F		F 	=> trường hợp này không xảy ra

=> ta tính được các test case:

+ trường hợp xâu có 1 kí tự chữ thường.

+ trường hợp xâu có 1 kí tự chữ hoa.

+ trường hợp xâu có 1 kí tự không phải chữ.

+ trường hợp xâu toàn chữ thường.

+ trường hợp xâu toàn chữ hoa.

+ trường hợp xâu có cả chữ thường, chữ hoa, số, các kí tự có giá trị nhỏ hơn 65, trong khoảng từ 90 đến 97, lớn hơn 122.

+ trường hợp xâu không có chữ, chỉ chứa các kí tự số và kí tự đặc biệt.


Kết quả: tất cả các unit test đều chạy qua. Mức độ bao phủ 100%.
