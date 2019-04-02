package Trees;

public class RecoveryNode implements BinaryTreeNode{
	/*
	 * 
	 */
	public String value;
	public RecoveryNode left = null;
	public RecoveryNode right = null;
	
	
	public RecoveryNode(String value)
	{
		this.value = value;
	}
	
	
	@Override
	public void setLeft(BinaryTreeNode node) 
	{
		this.left = (RecoveryNode)node;	
	}

	
	@Override
	public BinaryTreeNode getLeft() 
	{
		return this.left;
	}

	
	@Override
	public void setRight(BinaryTreeNode node) 
	{
		this.right = (RecoveryNode)node;
	}

	
	@Override
	public BinaryTreeNode getRight() 
	{
		return this.right;
	}

	
	@Override
	public BinaryTreeNode clone() 
	{
		return new RecoveryNode(this.value);
	}

	
	@Override
	public boolean isEqual(BinaryTreeNode node) 
	{
		RecoveryNode temp = (RecoveryNode)node;
		return this.value.equals( temp.value ) ? true : false;
	}

	
	@Override
	public boolean isLessThan(BinaryTreeNode node) 
	{
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * 
	 */
	public String toString()
	{
		return this.value;
	}
}
