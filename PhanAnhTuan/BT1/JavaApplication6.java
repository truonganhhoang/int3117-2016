package javaapplication6;
public class JavaApplication6 {
    public static int soChan(int A[]){
        int so = 0 ;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                so++;
            }
        }
        return so;
    }
}
