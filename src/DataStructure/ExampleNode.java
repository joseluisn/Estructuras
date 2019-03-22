package DataStructure;

public class ExampleNode implements Node{
	
	public int value;
	public ExampleNode next = null;
	
	
	/**
	 * 
	 * @param value
	 */
	public ExampleNode(int value) 
	{
		this.value = value;
	}
	
	@Override
	public void setNext(Node node) 
	{
		next = (ExampleNode)node;
	}

	@Override
	public Node getNext() 
	{
		return next;
	}

	@Override
	public Node clone() 
	{
		return new ExampleNode(this.value);
	}

	@Override
	public boolean isEqual(Node node) 
	{
		ExampleNode temp = (ExampleNode)node;
		return this.value == temp.value ? true : false;
	}

	@Override
	public boolean isLessThan(Node node) 
	{
		ExampleNode temp = (ExampleNode)node;
		return this.value < temp.value ? true : false;
	}
	
	@Override
	public String toString()
	{
		return this.value + ",";
	}
}
