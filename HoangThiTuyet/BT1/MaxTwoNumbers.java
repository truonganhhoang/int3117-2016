// Tim 2 so lon nhat
public class MaxTwoNumbers {
	 public String TwoMax(int a[],int N) {
         int max1, max2;
         max1 = a[0];
         if (a[1] > ma1) {
             max2 = max1;
             max1 = a[1];
         } else max2 = a[1];
         for (int i = 2; i < N; i++) {
             if (a[i] > max1) {
                 max2 = ma1;
                 max1 = a[i];
             } else {
                 if (a[i] > max2) {
                     max2 = a[i];
                 }
             }

         }
         
         return max1 + " " + max2;

     }

}
