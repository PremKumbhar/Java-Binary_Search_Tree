package com.bridgelabz.BinarySearchTree;

public class INode {
	/*
	 * 1. Declaring the variables that are used as left node,right node,root node
	 * and data;
	 */
	int data;
	INode left;
	INode right;
	/*
	 * 2. Method to get the size of the Binary Tree
	 */
	public static int size(INode node) {
		return (size1(node));
	}

	private static int size1(INode node) {
		if (node == null)
			return (0);
		else {
			return (size(node.left) + 1 + size(node.right));
		}
	}
}
