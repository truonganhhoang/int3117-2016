package pkDemo;

public class DemoTest {
	public int countEvent (int arr[]){
		int result =0;
		int units = 0;
		int tens = 0;
		if (arr.length==0){
			return 0;
		}
		for(int i=0; i<arr.length; i++){
			
			if(arr[i]>9 && arr[i]<100){
				units = arr[i]%10;
				tens = arr[i]/10;
				if(tens>units){
					result ++;
				}
			}
		}
		return result;
	}
}
