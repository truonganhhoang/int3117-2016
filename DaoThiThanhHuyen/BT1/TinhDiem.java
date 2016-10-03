package main;
import java.util.Scanner;

public class TinhDiem {
	
	public static String PhanLoai(int diem){
		if (diem >= 80 && diem <= 100) return "A";
		else if (diem >= 60 && diem < 80) return "B";
		else if (diem >= 50 && diem < 60) return "C";
		else if (diem >= 40 && diem < 50) return "D";
		else if (diem >= 0 && diem < 40) return "F";
		else return "Invalid";
	}

	public static int NhapDiem(){
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap diem tu 0 den 100: ");
		int diem = 0;
		do {
			diem = input.nextInt();
			if(diem >= 0 && diem <= 100) break;
			System.out.println("Diem khong hop le, nhap lai: ");
		} while(true);
		return diem;
	}
	
	public static void main(String[] args) {
		int diem = NhapDiem();
		System.out.println(PhanLoai(diem));
	}

}
