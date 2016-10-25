public class CheckPrime {
	
	public static boolean isPrime(int n) {
		if (n <= 0 || n == 1) {
			return false;
		} else {
			int i = 2;
			while (i < n) {
				if (n % i == 0) {
					break;
				}
				i++;
			}
			if (i == n) {
				return true;
			} else {
				return false;
			}
		}
	}
}
