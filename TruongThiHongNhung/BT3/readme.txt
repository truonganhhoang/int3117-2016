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
