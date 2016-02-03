package binarysearchtree;

public class SizeOfBinarySearchTree {
	
	public int sizeOfBinarySearchTree(Node root){
		if(root == null){
			return 0;
		}
		return sizeOfBinarySearchTree(root.left) + sizeOfBinarySearchTree(root.right) + 1;
	}
	
	public static void main(String args[]){
		Node root = Node.createNode(5);
		Node node1 = Node.createNode(10);
		Node node2 = Node.createNode(-3);
		Node node3 = Node.createNode(3);
		Node node4 = Node.createNode(7);
		Node node5 = Node.createNode(15);
		Node node6 = Node.createNode(0);

		BuildBinarySearchTreeIterative buildTree = new BuildBinarySearchTreeIterative();
		root = buildTree.buildBinarySearchTreeIterative(root, node1);
		root = buildTree.buildBinarySearchTreeIterative(root, node2);
		root = buildTree.buildBinarySearchTreeIterative(root, node3);
		root = buildTree.buildBinarySearchTreeIterative(root, node4);
		root = buildTree.buildBinarySearchTreeIterative(root, node5);
		root = buildTree.buildBinarySearchTreeIterative(root, node6);
		
		SizeOfBinarySearchTree sizeTree = new SizeOfBinarySearchTree();
		int size = sizeTree.sizeOfBinarySearchTree(root);
		System.out.println("Size of Binary Tree is:" + size);
	}

}
