package Parcial;

import DataStructure.Node;


public class LodgingNode implements Node {
	private String lodging;
	private int price;
	public LodgingNode nextLodging = null;

	// builder of class LodgingNode
	public LodgingNode(String Lodging, int price) {
		this.lodging = Lodging;
		this.price = price;
	}

	@Override
	public void setNext(Node node) {
		// TODO Auto-generated method stub
		this.nextLodging = (LodgingNode)node;
	}

	@Override
	public Node getNext() {
		// TODO Auto-generated method stub
		return nextLodging;
	}

	@Override
	public Node clone() {
		LodgingNode temp = new LodgingNode(this.lodging, this.price);
		return temp;
	}

	@Override
	public boolean isEqual(Node node) {
		LodgingNode temp = (LodgingNode)node;
		return this.price  == temp.price ? true : false;
	}

	@Override
	public boolean isLessThan(Node node) {
		LodgingNode temp = (LodgingNode)node;
		return this.price < temp.price ? true : false;
	}

	private int getPrice() {
		return price;
	}

	private void setPrice(int price) {
		this.price = price;
	}

	private String getLodging() {
		return lodging;
	}

	private void setLodging(String lodging) {
		this.lodging = lodging;
	}

}
