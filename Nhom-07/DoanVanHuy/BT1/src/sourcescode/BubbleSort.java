package sourcescode;


public class BubbleSort {
	public int[] BubbleSortCode( int [] array )
	{
	     int j;
	     boolean flag = true;
	     int temp;
	     if(array != null){
		     while ( flag )
		     {
		            flag= false; 
		            for( j=0;  j < array.length -1;  j++ )
		            {
		                   if ( array[j] < array[j+1] )
		                   {
	                           temp = array[j]; 
	                           array[j] = array[j+1];
	                           array[j+1] = temp;
	                          flag = true;
		                  } 
		            } 
		      }
	     } else  return null;
	     return array;
	}
}
