/**
 * 
 */
package in.manurampandit.trees;

import in.manurampandit.trees.TreeTraversal.Node;

/**
 * @author manurampandit
 * 
 */
public class TreeSize {
	private class Node {
		int value;
		Node left;
		Node right;

		
	}
	public Node createNode(int value) {
		Node node = new Node();
		node.value = value;
		node.left = null;
		node.right = null;
		return node;
	}
	public int size(Node root){
		if(root==null){
			return 0;
		}
		else
			return size(root.left) + 1 + size(root.right);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSize treeSizeObj= new TreeSize();
		Node root= treeSizeObj.createNode(7);
		Node firstLeft = treeSizeObj.createNode(5);
		root.left = firstLeft;
		Node firstRight=treeSizeObj.createNode(9);
		root.right=firstRight;
		Node tempNode=treeSizeObj.createNode(8);
		firstRight.left=tempNode;
		tempNode=treeSizeObj.createNode(10);
		firstRight.right=tempNode;
		tempNode=treeSizeObj.createNode(6);
		firstLeft.right=tempNode;
		System.out.println("size:" + treeSizeObj.size(root));
	}

}
