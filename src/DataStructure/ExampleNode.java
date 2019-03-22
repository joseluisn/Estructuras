package DataStructure;
import DataStructure.Node;



public class ExampleNode implements Node{
	
	private int value;
	public  ExampleNode next = null;
	
	
	

	public ExampleNode(int value) 
	{
		this.setValue(value);
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
		return new ExampleNode(this.getValue());
	}

	@Override
	public boolean isEqual(Node node) 
	{
		ExampleNode temp = (ExampleNode)node;
		return this.getValue() == temp.getValue() ? true : false;
	}

	@Override
	public boolean isLessThan(Node node) 
	{
		ExampleNode temp = (ExampleNode)node;
		return this.getValue() < temp.getValue() ? true : false;
	}
	
	@Override
	public String toString()
	{
		return this.getValue() + ",";
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
