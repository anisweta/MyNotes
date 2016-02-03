package binarysearchtree;

/*
 * This class contains properties of a node and provides member
 * function which helps to create a node with the data provided by user
 * 
 * Input @param: data
 * 
 * @return: Node
 * 
 * Test cases:
 * 	1. data = positive
 * 	2. data = negative
 * 	3. data = 0
 * 	4. data =< INTMIN
 *  5. data >= INTMAX 
 * 
 * E.g.,
 * 	Input: 5
 * 	Output: node with data 5
 */
public class Node {

	public int data;
	Node left;
	Node right;

	public static Node createNode(int data) {
		Node node = new Node();
		node.data = data;
		node.left = null;
		node.right = null;
		return node;
	}
}
