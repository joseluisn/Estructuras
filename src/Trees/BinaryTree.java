package Trees;

import DataStructure.ExampleNode;
import DataStructure.Node;

public class BinaryTree {

	public BinaryTreeNode root = null; //

	/**
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return root == null ? true : false;
	}

	/**
	 * 
	 * @param value
	 */
	public void insert(BinaryTreeNode node) {
		if (isEmpty()) {
			root = node;
		} else {
			BinaryTreeNode temp = root;
			BinaryTreeNode parent = root;

			while (temp != null) {
				parent = temp;
				if (node.isLessThan(temp))
					temp = temp.getLeft();
				else
					temp = temp.getRight();
			}

			if (node.isLessThan(parent))
				parent.setLeft(node);
			else
				parent.setRight(node);
		}
	}

	/**
	 * 
	 * @param value
	 * @return
	 */
	public BinaryTreeNode search(BinaryTreeNode nodeToSearch) {
		BinaryTreeNode temp = root;

		while (temp != null) {
			if (temp.isEqual(nodeToSearch))
				break;
			else if (nodeToSearch.isLessThan(temp))
				temp = temp.getLeft();
			else
				temp = temp.getRight();
		}

		return temp;
	}

	/**
	 * 
	 * @param value
	 */
	public void delete(BinaryTreeNode nodeToDelete) {
	 //create variable of type BinaryTreeNode for find the nodeToDelete
		BinaryTreeNode res= search(nodeToDelete);
		BinaryTree temp;
		if(res.isEqual(nodeToDelete)&& isLeaf(nodeToDelete)==true) {
		   nodeToDelete=null; 
	   }else if(res.isEqual(nodeToDelete)&& oneChild(nodeToDelete)==true) {
		   temp=(BinaryTree) nodeToDelete;
	   
	   }
	}

	/**
	 * 
	 * @param node
	 * @return
	 */
	public boolean isLeaf(BinaryTreeNode node) {
		return (node.getLeft() == null && node.getRight() == null) ? true : false;
	}

	/**
	 * 
	 * @param node
	 * @return
	 */
	public boolean oneChild(BinaryTreeNode node) {
		return (node.getLeft() != null && node.getRight() != null) ? false : true;
	}

	/**
	 * 
	 * @param node
	 */
	public void preorder(BinaryTreeNode node) {
		if (node != null) {
			System.out.print(node.toString() + " ");
			preorder(node.getLeft());
			preorder(node.getRight());
		}
	}

	/**
	 * 
	 * @param node
	 */
	public void postorder(BinaryTreeNode node) {
		if (node != null) {
			postorder(node.getLeft());
			postorder(node.getRight());
			System.out.print(node.toString() + " ");
		}

	}

	/**
	 * 
	 * @param node
	 */
	public void inorder(BinaryTreeNode node) {
		if (node != null) {
			inorder(node.getLeft());
			System.out.print(node.toString() + " ");
			inorder(node.getRight());
		}

	}

	public static void main(String[] args) {
		BinaryNodeExample node1 = new BinaryNodeExample(10);
		BinaryNodeExample node2 = new BinaryNodeExample(8);
		BinaryNodeExample node3 = new BinaryNodeExample(5);
		BinaryNodeExample node4 = new BinaryNodeExample(12);
		BinaryNodeExample node5 = new BinaryNodeExample(18);
		BinaryTree bin = new BinaryTree();

		bin.insert(node1);
		bin.insert(node2);
		bin.insert(node3);
		bin.insert(node4);
		bin.insert(node5);
		bin.postorder(node5);
		bin.inorder(node4);

	}

}
