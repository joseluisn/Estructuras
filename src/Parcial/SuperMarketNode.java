package Parcial;
import DataStructure.Node;

public class SuperMarketNode implements Node {
	private String name;
	public int price;
	public SuperMarketNode Products = null;
	
	//build of class SuperMarketNode
	
	public static void main(String[] args) {
		

	}

	@Override
	public void setNext(Node node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Node getNext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node clone() {
		// TODO Auto-generated method stub
		return null;
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
