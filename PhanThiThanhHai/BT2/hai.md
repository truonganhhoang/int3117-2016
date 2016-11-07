<<<<<<< HEAD
﻿#Mô tả bài toán : viết chương trình kiểm thử các trường hợp của tam giac bằng Junit trên ngôn ngữ Java.
----
##*input: đầu vào là độ dài các cạnh của tam giác: s1, s2, s3*
##*output: xem xét tam giác đó là tam giác gì.*
##*Xét các trường tam giác:* 
1. nếu tổng số đo 2 cạnh <= cạnh còn lại hoặc một trong ba cạnh của nó < 0 thì đó không phải tam giac (-1).
2. nếu số đo hai cạnh bằng nhau thì tam giác cân (1).
3. nếu số đo ba cạnh bằng nhau thi tam giác đều (2).
4. nếu bình phương một cạnh bằng tổng bình phương hai cạnh còn lại thì là tam giác vuông (4).
5. nếu là tam giác vuông và có hai cạnh của góc vuông bằng nhau thi là tam giác vuông cân (3).
6. còn lại là tam giác bình thường (5).

----
##*áp dụng MC/DC cho các điều kiện của một số trường hợp cụ thể:*
```sh
if (condition1 == false || condition2 == false) {
			System.out.println("Khong phai tam giac");
			result = -1;
		}
```

| TC | condition1 == false | condition2 == false | KQ |
|----|---------------------|---------------------|----|
| 1 | T | T | T |
| 2 | T | F | T |
| 3 | F | T | T |
| 4 | F | F | F |
----
```sh
if ((side1 == side2) || (side2 == side3) || (side3 == side1)) {
				System.out.println("tam giac can!");
				result = 1;
				break;
		}
```
| TC | side1 == side2 | side2 == side3 | side3 == side1 | KQ |
|----|----------------|----------------|----------------|----|
| 1 | T | T | T | T |
| 2 | T | T | F | T |
| 3 | T | F | T | T |
| 4 | F | T | T | T |
| 5 | T | T | F | T |
| 6 | T | F | F | T |
| 7 | F | T | F | T |
| 8 | F | F | T | T |
| 9 | F | F | F | F |
----
http://prntscr.com/d2a53x

| TC | 1 | 2 | 3 | 4 | 5 | 6 | KQ |
|----|---|---|---|---|---|---|----|
| 1 | T | T | F | F | F | F | T |
| 2 | T | F | F | F | F | F | F |
| 3 | F | T | F | F | F | F | F |
| 4 | T | T | T | T | T | T | - |
| 5 | T | F | F | T | F | F | - |
| 6 | T | F | T | F | F | F | - |
----
##**Tổng quát áp dụng với trường hợp MCDC ta có 14 ca kiểm thử như sau:**
| TC | condition1 | condition2 | s1=s2 | s2=s3 | s3=s1 | s3= Math.sqrt(s1Xs1+s2Xs2) | s2= Math.sqrt(s3Xs3+s2Xs2) | s1= Math.sqrt(s3Xs3+s2Xs2) | KQ |
|----|------------|------------|-------|-------|-------|----------------------------|----------------------------|----------------------------|----|
| 1 | T | F | - | - | - | - | - | - | -1 | 
| 2 | F | T | - | - | - | - | - | - | -1 | 
| 3 | T | T | - | - | - | - | - | - | -1 | 
| 4 | T | T | T | T | T | - | - | - | 2 | 
| 5 | T | T | T | F | F | F | F | F | 1 | 
| 6 | T | T | F | T | F | F | F | F | 1 | 
| 7 | T | T | F | F | T | F | F | F | 1 | 
| 8 | T | T | F | F | F | T | - | - | 4 | 
| 9 | T | T | F | F | F | - | T | - | 4 | 
| 10 | T | T | F | F | F | - | - | T | 4 |
| 11 | T | T | T | F | F | T | - | - | 3 | 
| 12 | T | T | F | T | F | - | - | F | 3 | 
| 13 | T | T | F | F | T | - | T | - | 3 | 
| 14 | T | T | F | F | F | F | F | F | 5 | 
----
# Đo mức độ bao phủ của bài toán
http://prntscr.com/d2a4fu
=======
﻿Mô tả bài toán : viết chương trình kiểm thử các trường hợp của tam giac bằng Junit trên ngôn ngữ Java.
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
>>>>>>> truonganhhoang/master
