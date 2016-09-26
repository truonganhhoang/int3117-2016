/**
 * Created by Vu Tung on 9/5/2016.
 */
public class BT1 {

    public int tongSoChan(int[] mang) {
        int tong = 0;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] % 2 == 0) {
                tong = tong + mang[i];
            }
        }
        return tong;
    }
}
