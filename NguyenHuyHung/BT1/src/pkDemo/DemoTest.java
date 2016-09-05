package pkDemo;

//dem va tra lai so so  co 2 chu so trong mang
public class DemoTest {
	public int findMin (int arr[]){
		int result =0;
		if (arr.length==0){
			return 0;
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i]>9 && arr[i]<100){
				result ++;
			}
		}
		return result;
	}
}
