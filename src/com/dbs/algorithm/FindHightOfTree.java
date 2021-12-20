//package com.dbs.algorithm;
//
//import com.sun.source.tree.BinaryTree;
//
//public class FindHightOfTree {
//	public static void main(String[] args) {
//		BinaryTree tree = new BinaryTree();
//		tree.root =new Node(1);
//		tree.root.left = new Node(2);
//		tree.root.right = new Node(3);
//		tree.root.left.left = new Node(4);
//		tree.root.left.right = new Node(5);
//		tree.maxDepth(tree.root);
//	}
//	int static maxDepth(Node node) {
//		if(node == null) {
//			return 0;
//		}else {
//			//compute maxDepth each subTree
//			int leftSubTree = maxDepth(node.left);
//			int rightSubTree = maxDepth(node.right);
//			if(leftSubTree>rightSubTree) {
//				return leftSubTree+1;
//			}else {
//				return rightSubTree+1;
//			}
//		}
//		
//		return 1;
//	}
//}
//
//class Node {
//	int data;
//	Node left, right;
//
//	Node(int item) {
//		data = item;
//		left = right = null;
//	}
//
//}