package bt2;

// Neu ca a va b deu chia het cho 3 hoac c chia het cho 3 thi tinh tong cac so chia het cho a, khong thi
// tinh tong cac so chia het cho b, trong 100 so dau tien

public class TinhTong {
    public int a, b, c;
    
    public TinhTong(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int tinhTong() {
        int sum = 0;
        int i = 0;
        if ( ((a % 3 == 0) && (b % 3 == 0)) || (c % 3 == 0)) {
            while (i < 100) {
                if (i % a == 0) sum += i;
                i++;
            } 
        } else {
            while (i < 100) {
                if (i % b == 0) sum += i;
                i++;
            } 
        }
        return sum;
    }
}
