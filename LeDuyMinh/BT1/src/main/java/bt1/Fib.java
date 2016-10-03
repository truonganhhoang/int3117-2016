package bt1;

public class Fib {
	public String printFirstNFib(int n) {
		if(n <= 0) return "Khong hop le";
		if(n > 100) return "So qua lon";
		
		if(n == 1) return "0";
		if(n == 2) return "0 1";
		
		int[] array = new int[n];
		String result = "";
		array[0] = 0;
		array[1] = 1;
		
		for(int i=2; i<n; i++)
		array[i] = array[i-1] + array[i-2];
		
		for(int i=0; i<n-1; i++)
		result += array[i] + " ";
		
		result += array[n-1];
		
		return result;
	}
}