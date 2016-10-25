Bài tập tuần 5 :

	Bài toán : 	tính tổng các số từ 0 đến n thỏa mãn điều kiện n > 0. 
				Với n > 0 tính tổng các số chia hết cho 2 hoặc số chia hết cho 3 và 5
				
	Áp dụng tiêu chuẩn MC/DC : 
		if(n>0) sinh ra ca kiểm thử A : T , B : F
		if (i % 2 == 0 || (i % 3 == 0 && i % 5 == 0)) đưa về dạng if(A||(C&&D))
			ta có các test case A: T T T, B: T F F, C: T T F, D: F T T, E: F F T ,
			G: F F F
	Kết hợp lại ta có 6 test case(loại bỏ trường hợp số chia hết cho 2,3,5) ứng với các trường hợp trên.
	