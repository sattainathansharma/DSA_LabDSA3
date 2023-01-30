package com.gl.pairfinder.bst;

public class TestDataUtils {

	public static BinarySearchTree sampleBST1() {
		
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(40);
		tree.insert(20);
		tree.insert(60);
		tree.insert(10);
		tree.insert(30);
		tree.insert(50);
		tree.insert(70);
	
		return tree;				
	}
}