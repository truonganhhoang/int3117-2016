import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearTreeTest {
	int [] arr1 ={ 1, 2, 3, 7, 6, 8, 9, 10, 15, 16, 25,20};
	int [] arr2 = {3,2,7,4,8,1,9,6};
	// test class Note
	@Test
	public void initalNote(){	
		Node node = new Node(1);
		assertEquals(1, node.data);
		assertEquals(null, node.left);
		assertEquals(null, node.right);
	}
	public static BinarySearchTree initialData(int[] array) {
		boolean result;
		BinarySearchTree bst = new BinarySearchTree();
		
		int x= 4;
		
		for(int i=0; i < array.length; i++)
		{
			result = bst.insert(array[i]);				

		}
		return bst;
	}
	
	 BinarySearchTree BSTTest1 = initialData(arr1);
	// test find method before delete
	 
	@Test
	public void notFoundTest(){	
		boolean result = BSTTest1.find(-1);
		 assertEquals(false, result);
	}
	@Test
	public void foundRootTest(){		 
		boolean result = BSTTest1.find(0);
		 assertEquals(false, result);
	}
	@Test
	public void foundTest(){		 
		boolean result = BSTTest1.find(1);
		 assertEquals(true, result);
	}
	
	// test delete
	@Test
	public void notdeletedTest (){		 
		boolean result = BSTTest1.delete(-1);
		assertEquals(false, result);
	}
	@Test
	public void deleteRoot (){		 
		boolean result = BSTTest1.delete(0);
		assertEquals(false, result);
	}
	@Test
	public void deletedTest (){		 
		boolean result = BSTTest1.delete(1);
		assertEquals(true, result);
	}
	@Test
	public void deleteLeftLeafNull(){		 
		boolean result = BSTTest1.delete(11);
		 assertEquals(false, result);
	}
	// test find method before delete
	@Test
	public void notFoundafterDeleteTest(){	
		boolean result = BSTTest1.find(1);
		assertEquals(true, result);
	}
	@Test
	public void foundAfterDeleteTest(){		 
		boolean result = BSTTest1.find(2);
		 assertEquals(true, result);
	}
	// test  getSuccessor method
	@Test
	public void testgetSuccessorRightNull(){		 
		Node deleteNode = new Node(3);
		 assertEquals(null, BSTTest1.getSuccessor(deleteNode));
	}
	@Test
	public void testgetSuccessorGetRight(){		 
		Node deleteNode = new Node(3);
		Node result = new Node(4);
		deleteNode.right = new Node(4);
		deleteNode.left = new Node(2);
		
		 assertEquals(null, BSTTest1.getSuccessor(deleteNode).right);
	}
	
	
	// Using Testing Data Flow
	
	// using Insert method
	
		
		
		
	BinarySearchTree BSTTest2 = initialData(arr2);
	// Test Find Method using binary search tree inserted using insert method
	@Test
	public void notFoundTestTree2(){	
		boolean result = BSTTest2.find(5);
		assertEquals(false, result);
	}
	public void foundTest1Tree2(){	
		boolean result = BSTTest2.find(3);
		assertEquals(true, result);
	}
	public void foundTest2Tree2(){	
		boolean result = BSTTest2.find(7);
		assertEquals(true, result);
	}
	
}


		 
		 

