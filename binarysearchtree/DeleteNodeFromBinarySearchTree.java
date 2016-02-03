package binarysearchtree;

public class DeleteNodeFromBinarySearchTree {
	
	public Node deleteNodeFromBinarySearchTree(Node root,Node node){
		if(root == null && node == null){
			throw new IllegalArgumentException();
		}
		while(root != null){
			if(node.data == root.data && node.left != null){
				root = root.left;
			}else if(node.data == root.data && node.right != null){
				root = root.right;
			}
			if(node.data < root.data){
				root = root.left;
			}else{
				root = root.right;
			}
		}		
		return node;
	}

}
