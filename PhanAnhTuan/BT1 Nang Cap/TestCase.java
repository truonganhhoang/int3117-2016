package javaapplication6;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCase {
   @Test
   public void test1(){
       int[] A= {0,2,6,4, -8,-12};
       assertEquals(6, JavaApplication6.soChan(A) );
   }
   
   @Test
   public void test2(){
       int[] A= {1,3,12,22,33,-4, -8, 4};
       assertEquals(5, JavaApplication6.soChan(A) );
   }
   
   @Test
   public void test3(){
       int[] A= {1,3,33,-5, -9, 11};
       assertEquals(0, JavaApplication6.soChan(A) );
   }
   
}