package main;

public class SoNguyen {
	public static long MAX_INT = 2147483647L;
	private int soNguyen;

	
	public SoNguyen(int n) {
		soNguyen = n;
	}
	public SoNguyen(long n) {
		if(n >= MAX_INT)
			soNguyen = 0;
		else soNguyen = (int)n;
	}
	//Tim so nguyen to lon nhat nho hon N. Neu khong co tra ve gia tri 0.
	public int soNguyenToLonNhatNhoHonN() {
		int soCanTim = 0;
		for(soCanTim = soNguyen - 1; soCanTim > 1; soCanTim--){
			if(laSoNguyenTo(soCanTim))
				break;
		}
		if(soCanTim <= 1)
			soCanTim = 0;
		return soCanTim;
	}
	
	//Kiem tra so nguyen to
	public boolean laSoNguyenTo(int n){
		if(n < 2)
			return false;
		else if(n == 2)
			return true;
		else {
			boolean ketqua = true;
			for(int i = 2; i < n; i++){
				if(n%i==0){
					ketqua = false;
					break;
				}
			}
			return ketqua;
		}
	}

}
