Tên SV : Lê Huy Cường
MSV : 13020052
Nhóm 05
*************************

Bài Tập Tuần 2 Kiểm Thử vs Đảm Bảo Chất Lượng PM
	-Bài toán: Cho một mảng các số tính các số là bội của 3 (A)và > 20 (B)hoặc là bội của 5(C) và < 50(D) 
				//		{(A&&B) || (C&&D)}
		-Áp dụng  MCDC ta có các bộ kiểm thử sau:
		
			{A,B,C,D} == {T,T,F,T};
			{A,B,C,D} == {T,T,T,F};
			
			{A,B,C,D} == {T,F,T,T};
			{A,B,C,D} == {F,T,T,T};
			
			{A,B,C,D} == {T,F,F,T};
			{A,B,C,D} == {T,F,T,F};
			{A,B,C,D} == {F,T,F,T};
			{A,B,C,D} == {F,T,T,F};