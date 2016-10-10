import demsochan.DemSoChan;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCase {
   @Test
   public void testMangSoChan(){
       int[] A= {0,2,6,4, -8,-12};
	   DemSoChan demsochan= new DemSoChan();
       assertEquals(6, demsochan.demSoChan(A) );
   }
   
   @Test
   public void testMangSoChanLe(){
       int[] A= {1,3,12,22,33,-4, -8, 4};
       DemSoChan demsochan= new DemSoChan();
       assertEquals(5, demsochan.demSoChan(A) );
   }
   
   @Test
   public void testMangSoLe(){
       int[] A= {1,3,33,-5, -9, 11};
       DemSoChan demsochan= new DemSoChan();
       assertEquals(0, demsochan.demSoChan(A) );
   }
   
   @Test
   public void testMangRong(){
	   int A[] = null;
	   DemSoChan demsochan= new DemSoChan();
       assertEquals(0, demsochan.demSoChan(A) );
   }
   
}