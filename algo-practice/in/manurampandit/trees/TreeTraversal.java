/**
 * 
 */
package in.manurampandit.trees;

/**
 * @author manurampandit
 * 
 */
public class TreeTraversal {
	public class Node {
		int data;
		Node left;
		Node right;
	}

	/**
	 * 
	 * @param data
	 * @return
	 */
	public Node createNode(int data) {
		Node node = new Node();
		node.data = data;
		node.left = null;
		node.right = null;
		return node;
	}

	public void printPostOrder(Node startNode) {
		if (startNode == null)
			return;
		printPostOrder(startNode.left);
		printPostOrder(startNode.right);
		System.out.println(startNode.data);
	}

	public void printPreOrder(Node startNode) {
		if (startNode == null)
			return;
		System.out.println(startNode.data);
		printPreOrder(startNode.left);
		printPreOrder(startNode.right);
	}

	public void printInOrder(Node startNode) {
		if (startNode == null)
			return;

		printInOrder(startNode.left);
		System.out.println(startNode.data);
		printInOrder(startNode.right);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeTraversal treeTraversalObj = new TreeTraversal();
		Node root = treeTraversalObj.createNode(7);

		Node firstLeft = treeTraversalObj.createNode(5);
		root.left = firstLeft;
		Node firstRight=treeTraversalObj.createNode(9);
		root.right=firstRight;
		Node tempNode=treeTraversalObj.createNode(8);
		firstRight.left=tempNode;
		tempNode=treeTraversalObj.createNode(10);
		firstRight.right=tempNode;
		tempNode=treeTraversalObj.createNode(6);
		firstLeft.right=tempNode;
		
		System.out.println("---:Preorder:---");
		treeTraversalObj.printPreOrder(root);
		System.out.println("---:Inorder:---");
		treeTraversalObj.printInOrder(root);
		System.out.println("---:Postorder:---");
		treeTraversalObj.printPostOrder(root);
	}

}
