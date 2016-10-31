public class BinarySearchTree {

	public static  Node root;
	public BinarySearchTree(){
		this.root = null;
	}
	public boolean insert(int id){
		Node newNode = new Node(id);
		if(root == null){
			root = newNode;
			return true;
		}
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			if(id < current.data){				
				current = current.left;
				if(current == null){
					parent.left = newNode;
					return true;
				}
			}else{
				current = current.right;
				if(current == null){
					parent.right = newNode;
					return true;
				}
			}
		}
	}
	
	public boolean find(int data){
		
		Node current = root;
		while( current!=null ){
			if(current.data == data){
				return true;
			}else if(current.data > data){
				current = current.left;
			}else{
				current = current.right;
			}
		}
		return false;
	}
	public boolean delete(int data){
		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;
		while(current.data != data){
			parent = current;
			if(current.data > data){
				isLeftChild = true;
				current = current.left;
			}else{
				isLeftChild = false;
				current = current.right;
			}
			if(current == null){
				return false;
			}
		}
		if(current.left == null && current.right == null){
			if(current == root){
				root = null;
			}
			if(isLeftChild == true){
				parent.left = null;
			}else{
				parent.right = null;
			}
		}
		
		else if(current.right == null){
			if(current == root){
				root = current.left;
			}else if(isLeftChild){
				parent.left = current.left;
			}else{
				parent.right = current.left;
			}
		}
		else if(current.left == null){
			if(current == root){
				root = current.right;
			}else if(isLeftChild){
				parent.left = current.right;
			}else{
				parent.right = current.right;
			}
		}else if(current.left != null && current.right != null){
			
			//now we have found the minimum element in the right sub tree
			Node successor	 = getSuccessor(current);
			if(current == root){
				root = successor;
			}else if(isLeftChild){
				parent.left = successor;
			}else{
				parent.right = successor;
			}			
			successor.left = current.left;
		}		
		return true;		
	}
	public Node getSuccessor(Node deleteNode){
		Node successsor = null;
		Node successsorParent = null;
		Node current = deleteNode.right;
		while(current != null){
			successsorParent = successsor;
			successsor = current;
			current = current.left;
		}
		//check if successor has the right child, it cannot have left child for sure
		// if it does have the right child, add it to the left of successorParent.
//		successsorParent
		if(successsor != deleteNode.right){
			successsorParent.left = successsor.right;
			successsor.right = deleteNode.right;
		}
		return successsor;
	}
	
	public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}	
}

