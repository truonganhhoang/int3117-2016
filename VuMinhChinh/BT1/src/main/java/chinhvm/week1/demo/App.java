package chinhvm.week1.demo;

/**
 * Hello world!
 *
 */
public class App 
{
	int[] numbers;
	
	public App(int[] x) {
		this.numbers = x;
	}
	
	public double findAverage() {
		double temp = 0;
		for(int i = 0; i < numbers.length; i++) {
			temp += numbers[i];
		}
		
		return temp/numbers.length;
	}
	
	public int findMin() {
		int result = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] < result) {
				result = numbers[i];
			}
		}
		
		return result;
	}
}
