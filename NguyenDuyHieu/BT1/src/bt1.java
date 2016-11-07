package bt1;


public class BT1 {
    //Tinh tong cac so chan trong n chu so dau
    
    public static int n = 0;
    private int sum = 0;
    
    public BT1(int n) {
        this.n = n;
        if (n >= 0) {
            for (int i = 0; i <= n; i++) {
            if (i%2 == 0) {
                sum += i;
            }
        }
        }
    }
    
    public static void main (String[] args) {
        BT1 bt1 = new BT1(0);
        bt1.toString();
    }
    
    @Override
    public String toString() {
        return sum + "";
    }
}
