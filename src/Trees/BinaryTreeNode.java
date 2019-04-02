package Trees;

public interface BinaryTreeNode {
	/**
	 * 
	 * @param node
	 */
	public void setLeft(BinaryTreeNode node);
	
	
	/**
	 * 
	 * @return
	 */
	public BinaryTreeNode getLeft();
	
	
	/**
	 * 
	 * @param node
	 */
	public void setRight(BinaryTreeNode node);
	
	
	/**
	 * 
	 * @return
	 */
	public BinaryTreeNode getRight();
	
	
	/**
	 * 
	 * @return
	 */
	public BinaryTreeNode clone();
	
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	public boolean isEqual(BinaryTreeNode node);
	
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	public boolean isLessThan(BinaryTreeNode node);	
	
	
	/**
	 * 
	 * @return
	 */
	public String toString();

}
