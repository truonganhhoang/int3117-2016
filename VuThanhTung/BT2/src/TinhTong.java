/**
 * Created by Vu Tung on 9/5/2016.
 */
public class TinhTong {

    public int tong(int n) {
        int tong = 0;
        if (n > 0) {
            int i = 0;
            while (i <= n) {
                if (i % 2 == 0 || (i % 3 == 0 && i % 5 == 0)) {
                    tong = tong +i;
                }
                i++;
            }
        }
        return tong;
    }
}
