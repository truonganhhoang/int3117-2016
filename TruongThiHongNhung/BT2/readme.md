_Bài toán: kiem tra xem 1 nam có phai nam nhuan không

	+ Nam nhuan là nam chia het cho 4 và không chia het cho 100 hoac chia het cho 400.
	+ Hàm test: 
public int getNumber(int year) {
        int result = -1;

        if (year < 0) {
            return result;
        }

        result = 0;
        if (year % 4 == 0 && year % 100 != 0
                || year % 400 == 0) {
            while (year != 0) {
                result = result * 10 + year % 10;
                year /= 10;
            }
        }
        return result;

	+)hàm intgetNumber(intyear): nhap vào 1 nam bat ki 
_Tiêu chuan MDCD Xét dieu kien if (year%4 == 0 && year%100 != 0) || (year%400 == 0)

No.	year%400	year%4	year%100	K?t qu?
1	T	-	-	T
2	F	T	F	T
3	F	T	T	F
4	F	F	-	F
_ Ðo bao phu: 72,8%
