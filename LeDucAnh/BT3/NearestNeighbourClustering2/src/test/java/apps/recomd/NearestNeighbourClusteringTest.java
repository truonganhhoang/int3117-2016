package apps.recomd;

import java.awt.Point;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class NearestNeighbourClusteringTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public NearestNeighbourClusteringTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( NearestNeighbourClusteringTest.class );
    }

    /**
     * Extension File Test :-)
     */
    public void testApp()
    throws Exception {
    	
    	int w = 100, h = 100;
    	
    	assertTrue(NearestNeighbourClustering.neigbors(new Point(20, 40), w, h).size() > 0);
    	
    }
    
    
}
