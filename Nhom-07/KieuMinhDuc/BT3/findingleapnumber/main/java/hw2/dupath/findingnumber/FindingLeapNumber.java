package hw2.dupath.findingnumber;

/* Counting the number of leap number ( similar as leap year )
 *  If the result 's a even number , it will return true  and vice versa
 * */
public class FindingLeapNumber 
{
	public boolean isCountingEvenLeapNumber( int n ){
        int count = 0 , i = 0;                                              // 1
        while ( i  <= n ){                                                  // 2
            if ( ( n % 4 == 0 ) && ( n % 100 != 0) || ( n % 400 == 0 ) ){   // 3
                count++;                                                    // 4
            }
            i++;                                                            // 5
        }
        if ( count % 2 == 0){                                               // 6
            return true;                                                    // 7
        }else{
            return false;                                                   // 8
        }
    }   
}
