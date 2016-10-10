package code;

/**
 * 
 * @author Viet Cuong Dinh
 *
 */
public class Number {

	/**
	 * Tìm vị trí của phần tử trong mảng, thuật toán tìm kiếm nhị phân
	 * 
	 * @param value
	 *            phần tử muốn tìm kiếm
	 * @param arr
	 *            mảng có sẵn
	 * @return nếu có phần tử trong mảng thì trả về vị trí của phần tử đó, nếu
	 *         không có thì trả về 0
	 */
	public int search(int value, int[] arr) {
		int left = 0;
		int right = arr.length;
		int pos = -1;
		while (left < right) {
			int mid = (left + right) / 2;
			if (arr[mid] == value) {
				pos = mid;
				break;
			} else if (arr[mid] > value) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return pos + 1;
	}
}
