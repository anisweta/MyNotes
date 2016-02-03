package binarysearchtree;
/*
 * This class helps to create a binary search tree by inserting node
 * in a recursive fashion.
 * 
 * Input @param: Root node,Node to be inserted
 * 
 * @return: root
 * 
 * Test Cases:
 *  1. root == null && node == null
 *  2. root == null || node == null
 * 	3. root == value && node == null
 *  4. root == value && node == value
 *  5. Tree with one node
 *  6. Tree with two nodes
 *  7. Tree with three or more nodes
 *  
 *  Example:
 *  Input: 5,10,-3,3,7,15,0 and 15 and 4
 *  Output(inorder): -3,0,3,4,5,7,10,15
 */
public class BuildBinarySearchTreeRecursive {
	
	public Node buildBinarySearchTreeRecursive(Node root,Node node){
		if(root == null){
			return node;
		}else if(node.data < root.data){
			root.left = buildBinarySearchTreeRecursive(root.left, node);
		}else{
			root.right = buildBinarySearchTreeRecursive(root.right, node);
		}
		return root;
	}

	public static void main(String args[]) {
		Node root = Node.createNode(5);
		Node node1 = Node.createNode(10);
		Node node2 = Node.createNode(-3);
		Node node3 = Node.createNode(3);
		Node node4 = Node.createNode(7);
		Node node5 = Node.createNode(15);
		Node node6 = Node.createNode(0);

		BuildBinarySearchTreeRecursive buildTree = new BuildBinarySearchTreeRecursive();
		root = buildTree.buildBinarySearchTreeRecursive(root, node1);
		root = buildTree.buildBinarySearchTreeRecursive(root, node2);
		root = buildTree.buildBinarySearchTreeRecursive(root, node3);
		root = buildTree.buildBinarySearchTreeRecursive(root, node4);
		root = buildTree.buildBinarySearchTreeRecursive(root, node5);
		root = buildTree.buildBinarySearchTreeRecursive(root, node6);

		InOrderTraversalRecursive.inorderTraversalRecursive(root);
	}

}
