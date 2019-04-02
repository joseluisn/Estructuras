package Trees;

public class BinaryNodeExample implements BinaryTreeNode{
	public int value;
	public BinaryNodeExample left;
	public BinaryNodeExample right;
	
	public  BinaryNodeExample(int value)
	{
		this.value = value;
	}
	
	
	@Override
	public void setLeft(BinaryTreeNode node) 
	{
		left = (BinaryNodeExample)node;
	}

	
	@Override
	public BinaryTreeNode getLeft() 
	{
		return left;
	}

	
	@Override
	public void setRight(BinaryTreeNode node)
	{
		right = (BinaryNodeExample)node;
	}

	
	@Override
	public BinaryTreeNode getRight() 
	{
		return right;
	}

	
	@Override
	public BinaryTreeNode clone()
	{
		return null;
	}

	
	@Override
	public boolean isEqual(BinaryTreeNode node) 
	{
		return false;
	}

	@Override
	public boolean isLessThan(BinaryTreeNode node)
	{
		return false;
	}
}
