package binarysearchtree;

public class MaxNodeInBinarySearchTree {
	
	public Node maxNodeInBinarysearchTree(Node root){
		if(root == null){
			return root;
		}
		while(root.right != null){
			root = root.right;
		}
		return root;
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
		
		MaxNodeInBinarySearchTree maxNode = new MaxNodeInBinarySearchTree();
		Node result = maxNode.maxNodeInBinarysearchTree(root);
		System.out.println("Node with maximum data in the Binary Search Tree has value:" + result.data);
	}
}
