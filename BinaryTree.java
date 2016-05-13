public class BinaryTree {
	public static Node root;
	
	//constructor
	public BinaryTree() {
		BinaryTree.root = null;
	}

	public boolean search(int e) {
		// start from the root
		Node current = root;
		while (current != null) {
			// the element is in the tree
			if (current.data == e) {
				return true;
			} else if (current.data > e) {
				// go left
				current = current.left;
			} else {
				// go right
				current = current.right;
			}
		}
		// the element is not in the tree
		return false;
	}
	
	//insert the element into the binary search tree
	public void insert(int e) {
		Node newNode = new Node(e);
		if (root == null) {
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while (true) {
			parent = current;
			if (e < current.data) {
				current = current.left;
				if (current == null) {
					parent.left = newNode;
					return;
				}
			} else {
				current = current.right;
				if (current == null) {
					parent.right = newNode;
					return;
				}
			}
		}
	}
	

}
