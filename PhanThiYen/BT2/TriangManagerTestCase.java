package testmain;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import main.Triange;
import main.TriangeManager;

public class TriangManagerTestCase {
	TriangeManager triangeManager;

	@Test
	public void testManager1() {
		triangeManager = new TriangeManager();
		boolean condition = triangeManager.testTriangManager(null);
		assertFalse(condition);
	}
	
	@Test
	public void testManager2() {
		triangeManager = new TriangeManager();
		List<Triange> trianges = new ArrayList<Triange>();
		boolean condition = triangeManager.testTriangManager(trianges);
		assertTrue(condition);
	}

}
