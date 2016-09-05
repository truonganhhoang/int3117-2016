
public class baitap1 {
	public static int findMax(int[] array) {
		int max = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max)
				max = array[i];
		}
		return max;
	}
}
