package binarysearchtree;
/*
 * The purpose of this class is to support displaying a binary search tree
 * in in-order pattern [left-root-right]
 * 
 * Input @param: root
 * 
 * @return: all node data in in-order pattern
 * 
 * Test cases: 
 * 	1. root == null
 * 	2. Tree with one node
 * 	3. Tree with two or more nodes
 * 
 * E.g., 
 * 	Input: 2,9,0,-5,5,4,3,4,29
 * 	Output: -5,0,2,3,4,4,5,9,29
 */
public class InOrderTraversalRecursive {
	
	public static void inorderTraversalRecursive(Node root){		
		if(root == null){
			return;
		}
		
		inorderTraversalRecursive(root.left);
		System.out.print(root.data + ",");
		inorderTraversalRecursive(root.right);		
	}
	
	public static void main(String args[]){		
		int data = 5;
		Node root = Node.createNode(data);
		InOrderTraversalRecursive.inorderTraversalRecursive(root);		
	}
}
