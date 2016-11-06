package com.int3117;

public class TinhTong {
	private int n;

	public TinhTong() {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public int tinhTong(int n) {
		int i = 0;
		int result = 0;
		if (n < 0)
			return -1;
		while (i <= n) {
			if ((i % 2 == 0 && i % 5 == 0) || i % 10 == 0) {
				result += i;
			}
			i++;
		}
		return result;
	}

	public static void main(String[] args) {
		TinhTong tong = new TinhTong();
		tong.tinhTong(100);
	}
}
