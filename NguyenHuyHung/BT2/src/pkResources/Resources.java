//Hung.slumber
package pkResources;

public class Resources {
	public int conferResources (int[] consume, int size){

		int conferred=0;
		int swap;
		int counter =0;
		int index = 0;
		int length = consume.length;
		//sort
		for(counter=0;counter<length-1; counter++){
			for(index=0; index<length-counter-1; index++){
				if(consume[index]>consume[index+1]){
					swap = consume[index];
					consume[index]=consume[index+1];
					consume[index+1]=swap;
				}
			}
		}
		
		
		index = 0;
		counter = 0;
		while ((index<length) && ((conferred+consume[index])<=size)){
			conferred = conferred+consume[index];
			if((index+1)<length && (conferred+consume[index+1])>size && (conferred-consume[index]+consume[index+1])<=size) {
				conferred = conferred-consume[index];
				//can use while?
				for(counter=0; counter < length-index-1; counter++ ){
					if((conferred+consume[length-counter-1])<=size){
						conferred = conferred+consume[length-counter-1];
						index = length-counter;
						break;
					}
				}
			} else {
				//smile
				index ++;
			}
		}
		return conferred;
	}

}
