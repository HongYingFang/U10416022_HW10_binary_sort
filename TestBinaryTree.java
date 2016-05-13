//U10416022
 class TestBinaryTree {
	public static void main(String arg[]) {
		BinaryTree b = new BinaryTree();
		//insert ten numbers(element)
		b.insert(3);
		b.insert(7);
		b.insert(15);
		b.insert(34);
		b.insert(58);
		b.insert(70);
		b.insert(65);
		b.insert(2);
		b.insert(77);
		b.insert(34);
		//print out result
		System.out.println("Original Tree : ");
		//call display method and put the numbers in sequence by binary tree
		b.display(BinaryTree.root);
		//call search method to check whether the node exists or not
		System.out.println("");
		System.out.println("Check whether the node value 4 exists : " + b.search(4));
		System.out.println("Check whether the node value 7 exists : " + b.search(7));
		
	}

}
