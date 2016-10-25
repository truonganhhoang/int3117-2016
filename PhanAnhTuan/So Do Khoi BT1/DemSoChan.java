package demsochan;
public class DemSoChan {

    public int demSoChan(int A[]){
        int result =0;
        if(A == null){
            return 0;
        }
        for(int i=0; i<A.length; i++){
            if(A[i] % 2 ==0){
                result+= 1;
            }
        }
        return result;
    }
    
}
