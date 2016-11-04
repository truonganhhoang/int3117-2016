package quoccuong.uet.vn;

/**
 * Created by QuocCuong on 9/26/2016.
 */
public class tongCacUocCuaBaVaNam {

    public boolean boiCuaN(int N, int M){
        if(M%N == 0)
            return true;
        return false;
    }

    public int tongCacUoc( int[] arr){

        if(arr.length<=0)
            return -1;

        int tong =0;
        for(int i=0; i< arr.length;i++){
            if(boiCuaN(3,arr[i])){
                tong += arr[i];
            }else if(boiCuaN(5,arr[i])){
                tong += arr[i];
            }
        }
        return tong;
    }

}
