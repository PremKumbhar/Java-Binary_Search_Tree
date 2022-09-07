package com.bridgelabz.BinarySearchTree;

public class Main {
	/*
	 *  Procedure
	 *  Create a Binary Search Tree  and checking the size of tree
	 * ====================================================================
	 *1. Creating an object of function class
	 *2.Creating an object of node class to get the size of tree
	 *3. Creating root node as null
	 *4.Adding sub-nodes to the Binary Tree
	 *5. Printing the elements
	 *6. Getting Size of the Tree
	 */
	
	public static void main(String[] args) {
		
		/*
		 * 1. Creating an object of function class
		 */
		BST link = new BST();
		
		/*
		 * 2.Creating an object of node class to get the size of tree
		 */
		INode size = new INode();
		/*
		 * 3.creating root node as null
		 */
		INode root = null;

		/*
		 * 4.Adding sub-nodes to the Binary Tree
		 */
		root = link.insert(root, 56);
		root = link.insert(root, 30);
		root = link.insert(root, 70);
		root = link.insert(root, 22);
		root = link.insert(root, 40);
		root = link.insert(root, 60);
		root = link.insert(root, 95);
		root = link.insert(root, 11);
		root = link.insert(root, 65);
		root = link.insert(root, 3);
		root = link.insert(root, 16);
		root = link.insert(root, 63);
		root = link.insert(root, 67);

		/*
		 * 5.Printing the tree
		 */
		link.printBST(root);
		/*
		 * 6. Getting Size of the Tree
		 */
		int x = size.size(root);		
		System.out.println("\nSize of Tree: "+x);
		/*
		 * 6. Searching for given key value whether it is present or not
		 */
		link.search(root, 63);

	}
}
