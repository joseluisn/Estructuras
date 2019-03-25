package Parcial;
import DataStructure.Node;

public class PrepareProgrammingTest implements Node{
	private String name;
	public PrepareProgrammingTest tools = null; 
	
	public PrepareProgrammingTest(String name) {
		this.setName(name);
	}

	@Override
	public void setNext(Node node) {
		this.tools=(PrepareProgrammingTest)node;
	}

	@Override
	public Node getNext() {
		return tools;
	}

	@Override
	public Node clone() {
	PrepareProgrammingTest temp = new PrepareProgrammingTest(this.getName());
		return temp;
	}

	@Override
	public boolean isEqual(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLessThan(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

}
