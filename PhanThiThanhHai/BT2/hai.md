Mô tả bài toán : viết chương trình kiểm thử các trường hợp của tam giac bằng Junit trên ngôn ngữ Java.
Xét các trường tam giác: + nó không phải tam giac
			+ tam giác bình thường
			+ tam giác cân
			+ tam giác đều
			+ tam giác vuông
			+ tam giác vuông cân
Áp dụng với trường hợp MCDC ta có 12 ca kiểm thử như sau:
	condition1   condition2 	s1=s2    s2=s3    s3=s1 	s3= Math.sqrt(s1*s1+s2*s2)  	s2= Math.sqrt(s3*s3+s2*s2)     s1= Math.sqrt(s3*s3+s2*s2)     KQ
1     T           F                -      -          -          -                                   -                           -                         -1
2     F           T                -      -          -          -                                   -                           -                         -1
3     F           F                -      -          -          -                                   -                           -                         -1
3     T           T                T       T         T          -                                   -                           -                         2
4     T 		  T                T       F         F          F                                   F                           F                         1
5     T           T                F       T         F          F                                   F                           F                         1
6     T           T                F       F         T          F                                   F                           F                         1
7     T           T                F       F         F          T                                   -                           -                         4
8     T           T                F       F         F          -                                   T                           -                         4
9     T           T                F       F         F          -                                   -                           T                         4
10    T           T                T       F         F          T                                   -                           -                         3
11    T           T                F       T         F          -                                   -                           F                         3
12    T           T                F       F         T          -                                   T                           -                         3
13    T           T                F       F         F          F                                   F                           F                         5