/**
 * Created by Vu Tung on 9/5/2016.
 */
public class SumEvenNumberArray {

    public int sumEvenNumber(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }
}
