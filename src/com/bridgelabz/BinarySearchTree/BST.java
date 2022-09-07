package com.bridgelabz.BinarySearchTree;

	public class BST extends INode {
		/**
		 * 
		 * 1. Creating node to insert new subnodes to binary tree
		 * 2.  Method to search for a given key value
		 * 3. Method for printing the Binary Tree
		 */

		
		public INode createNewNode(int k) {
			INode a = new INode();
			a.data = k;
			a.left = null;
			a.right = null;
			return a;
		}

		/*
		 * 1. Creating node to insert new subnodes to binary tree
		 */
		public INode insert(INode node, int k) {
			if (node == null) {
				return createNewNode(k);
			}
			if (k < node.data) {
				node.left = insert(node.left, k);
			} else if (k > node.data) {
				node.right = insert(node.right, k);
			}
			return node;

		}
		/*
		 *2.  Method to search for a given key value
		 */
		public INode search(INode node, int key) {
			
			// Base Cases: root is null or key is present at root
			if (node == null || node.data == key) {
				System.out.println(node.data + " is present in the Tree");
				return node;
			} else {
				// Key is greater than root's key
				if (node.data < key) {
					return search(node.right, key);
				} else {
					// Key is smaller than root's key
					return search(node.left, key);
				}
			}
		}

		/*
		 * 3. Method for printing the Binary Tree
		 */
		public void printBST(INode node) {
			if (node == null) {
				return;
			}
			printBST(node.left);
			System.out.print(node.data + " -> ");
			printBST(node.right);
		}

}
