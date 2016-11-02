public class MinClass {
	public int findMin(int[] arr) {
		int min = arr[0];
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}