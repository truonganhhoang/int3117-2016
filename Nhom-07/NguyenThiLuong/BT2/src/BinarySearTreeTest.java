import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearTreeTest {
	public static BinarySearchTree initialData() {
		BinarySearchTree bst = new BinarySearchTree();
		int [] arr ={0,1, 2, 3, 4, 6, 8, 9, 10, 15, 16, 20, 25};
		int x= 4;
		
		for(int i=0; i < arr.length; i++)
		{
			bst.insert(arr[i]);		
		}
		return bst;
	}
	 BinarySearchTree BSTTest = initialData();
	// test find method before delete
	@Test
	public void notFoundTest(){	
		boolean result = BSTTest.find(-1);
		 assertEquals(false, result);
	}
	@Test
	public void foundTest(){		 
		boolean result = BSTTest.find(1);
		 assertEquals(true, result);
	}
	
	// test delete
	@Test
	public void notdeletedTest (){		 
		boolean result = BSTTest.find(-1);
		assertEquals(false, result);
	}
	@Test
	public void deletedTest (){		 
		boolean result = BSTTest.find(1);
		assertEquals(true, result);
	}
	
	// test find method before delete
	@Test
	public void notFoundafterDeleteTest(){	
		boolean result = BSTTest.find(1);
		assertEquals(true, result);
	}
	public void foundAfterDeleteTest(){		 
		boolean result = BSTTest.find(2);
		 assertEquals(true, result);
	}
}

		 
		 

