package sourcescode;


public class MyClass {
	public int[] BubbleSort( int [] num )
	{
	     int j;
	     boolean flag = true;
	     int temp;
	     while ( flag )
	     {
	            flag= false; 
	            for( j=0;  j < num.length -1;  j++ )
	            {
	                   if ( num[j] < num[j+1] )
	                   {
	                           temp = num[j]; 
	                           num[j] = num[j+1];
	                           num[j+1] = temp;
	                          flag = true;
	                  } 
	            } 
	      }
	     return num;
	}
}
