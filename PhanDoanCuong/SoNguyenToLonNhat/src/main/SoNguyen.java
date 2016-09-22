package main;

public class SoNguyen {
	private int soNguyen;
	
	public SoNguyen(int n) {
		soNguyen = n;
	}
	
	//Tim so nguyen to lon nhat nho hon N. Neu khong co tra ve gia tri 0.
	public int soNguyenToLonNhatNhoHonN() {
		int soCanTim = 0;
		for(soCanTim = soNguyen - 1; soCanTim > 1; soCanTim--){
			if(laSoNguyenTo(soCanTim))
				break;
		}
		if(soCanTim == soNguyen - 1)
			soCanTim = 0;
		return soCanTim;
	}
	
	//Kiem tra so nguyen to
	public boolean laSoNguyenTo(int n){
		if(n < 2)
			return false;
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
