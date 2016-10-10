package bt1;

public class SoNT {
	public String timSoNT(int n, int m) {
		if(n < 2 && m < 2) return "Khong tim thay so nguyen to nao!";
		
		if((n >= 2 && m < 2) || (n < 2 && m >= 2)) {
			if(n < 2) n = 2;
			else m = 2;
		}
		
		if(n > m) {
			int temp = n;
			n = m;
			m = temp;
		}
		
		String result = "";
		
		for(int i = n; i <= m; i++)
		if(kiemTraSoNT(i)) result += i + " ";
		
		if(result.equals("")) result = "Khong tim thay so nguyen to nao!";
		
		return result;
	}
	
	public boolean kiemTraSoNT(int n) {
		for(int i = 2; i <= Math.sqrt(n); i++)
		if(n % i == 0) return false;
		
		return true;
	}
}