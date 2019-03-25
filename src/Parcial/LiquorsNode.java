package Parcial;
import DataStructure.Node;

public class LiquorsNode implements Node{
	private String liquors;
	public int price;
	public LiquorsNode nextLiquors = null;
	

	//builder of class LiquorsNode
		public LiquorsNode(String name, int price){
			this.setLiquors(liquors);
			this.setPrice(price);
		}

	@Override
	public void setNext(Node node) {
		this.nextLiquors=(LiquorsNode)node;
	}

	@Override
	public Node getNext() {
		return nextLiquors;
	}

	@Override
	public Node clone() {
		LiquorsNode temp= new LiquorsNode(this.liquors, this.price);
		return temp;
	}

	@Override
	public boolean isEqual(Node node) {
		LiquorsNode temp = (LiquorsNode)node;
		return this.price == temp.price ? true : false;
	}

	@Override
	public boolean isLessThan(Node node) {
		LiquorsNode temp = (LiquorsNode)node;
		return this.price < temp.price ? true : false;
	}

	private String getLiquors() {
		return liquors;
	}

	private void setLiquors(String liquors) {
		this.liquors = liquors;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
