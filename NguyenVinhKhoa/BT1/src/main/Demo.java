package main;

public class Demo {
	private int[] a;
	
	public Demo(int a[]) {
		this.a = a;
	}
	
	public int findMax() {
		int result = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] > result) {
				result = a[i];
			}
		}
		
		return result;
	}
	
	public int findMin() {
		int result = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] < result) {
				result = a[i];
			}
		}
		
		return result;
	}
	
	public static void main(String args[]) {
		System.out.println("Hello World");
	}
}
