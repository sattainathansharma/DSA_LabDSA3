package com.gl.binarytree;

import com.gl.pairfinder.bst.BinarySearchTree;
import com.gl.pairfinder.bst.TestDataUtils;

import internal.Log;

public class BSTPairFinderTester {
	public static void main(String[] args) {

		test(130);

	}

	private static void test(int sum) {

		BinarySearchTree tree = TestDataUtils.sampleBST1();

		Log.ENABLE = true;

		BSTPairFinder finder = new BSTPairFinder(tree);

		finder.findPair(sum);

		System.out.println("-----------------------");

		Log.ENABLE = false;

	}
}