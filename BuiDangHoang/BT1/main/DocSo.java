package main;

public class DocSo {
	public String docDonVi(int number) {
		String result = "";
		switch (number) {
		case 0:
			result = "khong";
			break;
		case 1:
			result = "mot";
			break;
		case 2:
			result = "hai";
			break;
		case 3:
			result = "ba";
			break;
		case 4:
			result = "bon";
			break;
		case 5:
			result = "nam";
			break;
		case 6:
			result = "sau";
			break;
		case 7:
			result = "bay";
			break;
		case 8:
			result = "tam";
			break;
		case 9:
			result = "chin";
			break;
		}
		return result;
	}

	public String docHangChuc(int number) {
		String result = "";
		switch (number) {
		case 0:
			result = "khong";
			break;
		case 1:
			result = "muoi";
			break;
		case 2:
			result = "hai muoi";
			break;
		case 3:
			result = "ba muoi";
			break;
		case 4:
			result = "bon muoi";
			break;
		case 5:
			result = "nam muoi";
			break;
		case 6:
			result = "sau muoi";
			break;
		case 7:
			result = "bay muoi";
			break;
		case 8:
			result = "tam muoi";
			break;
		case 9:
			result = "chin muoi";
			break;
		}
		return result;
	}

	public String docSo(int number) {
		String result = "";
		result += docHangChuc(number / 10) + " ";
		if (number % 10 != 0) {
			result += docDonVi(number % 10);
		}
		return result;
	}

	public int tinhTong(int a, int b) {
		return a + b;
	}

	public int tinhTong(String type, int number) {
		int result = 0;
		if (type.equalsIgnoreCase("chan")) {
			for (int i = 0; i <= number; i++) {
				if (i % 2 == 0)
					result += i;
			}
		} else if (type.equalsIgnoreCase("le")) {
			for (int i = 0; i <= number; i++) {
				if (i % 2 == 1)
					result += i;
			}
		} else {

		}
		return result;
	}

	public static void main(String[] args) {
		DocSo ds = new DocSo();
		System.out.println(ds.tinhTong("chan",8));
	}
}
