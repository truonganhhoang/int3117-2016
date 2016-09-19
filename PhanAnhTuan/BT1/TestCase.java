package javaapplication6;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCase {
   @Test
   public void test1(){
       int[] A= {1,2,3,4};
       assertEquals(2, JavaApplication6.soChan(A) );
   }
   
   @Test
   public void test2(){
       int[] A= {12,22,33,-4, -8, 4};
       assertEquals(5, JavaApplication6.soChan(A) );
   }
   
   @Test
   public void test3(){
       int[] A= {1,3,33,-5, -9, 11};
       assertEquals(0, JavaApplication6.soChan(A) );
   }
   
}
