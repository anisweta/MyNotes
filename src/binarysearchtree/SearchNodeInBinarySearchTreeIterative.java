package binarysearchtree;
/*
 * This class helps to search a node in a binary search tree in iterative fashion
 * 
 * Input @param: Root node,Node to search
 * 
 * @return: matching node
 * 
 * Test Cases:
* 	1. root == null && node == null
 *  2. root == null || node == null
 * 	3. root == value && node == null
 *  4. root == value && node == value
 *  5. Tree with one node and matching node
 *  6. Tree with one node and no matching node
 *  6. Tree with two or more nodes and matching node
 *  7. Tree with two or more nodes and no matching node
 *  
 *  Example:
 *  Input: 5,10,-3,3,7,15,0 and 15
 *  Output: 15
 */
public class SearchNodeInBinarySearchTreeIterative {
	
	public Node searchNodeInBinarySearchTreeIterative(Node root, Node node){
		if(root == null && node == null){
			throw new IllegalArgumentException();
		}
	
		while(root !=null){
			if(node.data == root.data){
				return root;
			}else if(node.data < root.data){
				root = root.left;
			}else{
				root = root.right;
			}
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
		
		Node node = Node.createNode(15);
		
		SearchNodeInBinarySearchTreeIterative searchNode = new SearchNodeInBinarySearchTreeIterative();
		Node result = searchNode.searchNodeInBinarySearchTreeIterative(root, node);
		System.out.println(result.data);		
	}

}
