/**
 * Created by QuocCuong on 9/5/2016.
 */
public class BT1 {
    public static int tongCacUoc(int[] mang){
        int tong = 0;
        for(int i=0; i< mang.length;i++){
            if(boiCuaN(3,mang[i]) || boiCuaN(5,mang[i])){
                tong += mang[i];
            }
        }
        return tong;
    }


    public static boolean boiCuaN(int N, int M){
        if(M % N == 0) return true;
        return false;
    }
}
