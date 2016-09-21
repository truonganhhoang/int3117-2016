package Test2;
// Tim 2 so lon nhat
public class MaxTwoNumbers {
	 public String TwoMax(int a[],int N) {
         int ma1, ma2;
         ma1 = a[0];
         if (a[1] > ma1) {
             ma2 = ma1;
             ma1 = a[1];
         } else ma2 = a[1];
         for (int i = 2; i < N; i++) {
             if (a[i] > ma1) {
                 ma2 = ma1;
                 ma1 = a[i];
             } else {
                 if (a[i] > ma2) {
                     ma2 = a[i];
                 }
             }

         }
         
         return ma1 + " " + ma2;

     }

}
