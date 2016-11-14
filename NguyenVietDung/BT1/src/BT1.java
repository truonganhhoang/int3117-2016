package bt1;

public class BT1 {
    //tinh tong cac so chia het cho 10 trong n so dau, n<=10000

    private int n = 0;
    private int sum = 0;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public BT1(int n){
        this.n = n;
        tinhTong();
    }
    private void tinhTong() {
        if (n >= 0 && n <= 10000) {
            for (int i = 0; i <= n; i++) {
                if (i%10 == 0) {
                    sum += i;
                }
            }
        }
        else if (n<0) System.out.println("N phai la so nguyen duong");
        else System.out.println("N qua lon");
    }
}

