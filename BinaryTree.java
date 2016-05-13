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
	

}
