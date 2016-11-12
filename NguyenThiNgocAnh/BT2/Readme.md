


## Mô tả
- _Chương trình xét một năm bất kì có là năm nhuận hay không, năm nhuận dương lịch hay cả dương lịch và âm lịch_ 
- _viết bằng java, unit test sử dụng thư viện junit trên eclipse._

## Hàm cần test

'''
public int TimNamNhuan(int nam) {

		if ((nam % 400 == 0) || (nam % 100 != 0 && nam % 4 == 0)) {
			int x = nam % 19;
			if (x == 0 || x == 3 || x == 6 || x == 8 || x == 11 || x == 14 || x == 17) {

				return 0;
			} else
				return 1;
		} else
			return 2;
	}
'''

## Biểu thức Branch:

'((nam % 400 == 0) || (nam % 100 != 0 && nam % 4 == 0))'

## Áp dụng MCDC:

|TB | nam%400==0 | nam%4==0  | nam%100!=0 | Branch |
|:-:|:----------:|:---------:|:----------:|:------:|
| 1 |T           |T 		 |T 		  |T	   | 
| 2 |T           |T  		 |F			  |T       |
| 3 |T  		 |F			 |_ 		  |T       |
| 4 |T 			 |F			 |F			  |T       |
| 5 |F			 |T          |T 		  |T       |
| 6 |F			 |T  		 |F			  |F       |
| 7 |F			 |F			 |_ 		  |F       |
| 8 |F           |F 		 |_			  |F       |

- các giá trị "nam" thỏa mãn MCDC: nam = 1990, 2000, 2001, 2012.
# Độ bao phủ

![Coverage](http://i.imgur.com/7dKSbjV.png)