package Demo;

public class Practice {
	public int smallest(int[] number){
		int min=number[0];
		for(int i=1;i<number.length;i++){
			if(number[i]<min)
				min=number[i];
		}
		return min;
	}
	public int largest(int[] number){
		int max=number[0];
		for(int i=1;i<number.length;i++){
			if(number[i]>max)
				max=number[i];
		}
		return max;
	}
	public int binhphuong(int a){
		return a*a;
	}
	public boolean isEven(int number){
		if (number%3==0)
			return true;
		return false;
	}
}
