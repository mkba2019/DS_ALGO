
public class BST {
	
	Node root;
	
	public BST(){
	root  = null;	
	}
	class Node {
		int key;
		String value;
		Node left, right;
		
		public Node(int key, String value) {
			this.key= key;
			this.value = value;
		}
		
		public Node findMin() {
			if(left == null) return this;
			else return left.findMin();
		}
	}
	
	public String find(int  key) {
		Node node = find(root,key);
		return node==null ?null :node.value;
	}

	private Node find(Node node, int key) {
		if(node == null || node.key == key) {
			return node;
		} else if (node.key > key) {
			return find(node.right , key);
		} else if(node.key<key){
			return find(node.left, key);
		}
		return null;
	}
	
	public Node insert(Node node , int key , String value) {
		
		//create a new node to be inserted 
		Node newNode = new Node(key,value);
		
		//if null set it here and return
		if(node == null) {
			node = newNode;
			return node;
		}
		
		//search untill find a node that is null and set it  there 
		if(key < node.key) {
			node.left = insert(node.left, key,value);
		}else if(key > node.key) {
			node.right = insert(node.right, key,value);
		}
		//return node
		return node;
	}
	


}
