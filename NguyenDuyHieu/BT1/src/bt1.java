package bt1;


public class BT1 {
    //Tinh tong cac so chan trong n chu so dau, n <= 10000
    
public class TinhTongSoChan {
   
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
    
    public TinhTongSoChan(int n) {
        this.n = n;
        tinhtong();
    }
    
    public static void main (String[] args) {
        TinhTongSoChan tong = new TinhTongSoChan(10000);
        System.out.println(tong.getSum());
    }
    
    private void tinhtong() {
        if (n >= 0 && n <= 10000) {
            for (int i = 0; i <= n; i++) {
                if (i%2 == 0) {
                    sum += i;
                }
            }
        }
        else if (n<0) System.out.println("N phai la so nguyen duong");
        else System.out.println("N qua lon");
    }
}
