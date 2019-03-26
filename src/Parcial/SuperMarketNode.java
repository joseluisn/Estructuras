package Parcial;

import DataStructure.Node;

public class SuperMarketNode implements Node {
	private String name;
	public int price;
	public SuperMarketNode Products = null;

	// build of class SuperMarketNode
	public SuperMarketNode(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {

	}

	@Override
	public void setNext(Node node) {
		this.Products = (SuperMarketNode) node;
	}

	@Override
	public Node getNext() {
		return Products;
	}

	@Override
	public Node clone() {
	SuperMarketNode temp = new SuperMarketNode(this.name, this.price);
			return temp;
	}

	@Override
	public boolean isEqual(Node node) {
		SuperMarketNode temp = (SuperMarketNode)node;
		return this.price == temp.price ? true : false;
	}

	@Override
	public boolean isLessThan(Node node) {
		SuperMarketNode temp = (SuperMarketNode)node;
		return this.price < temp.price ? true : false;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

}
