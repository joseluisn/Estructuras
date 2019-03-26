package Parcial;

import DataStructure.Node;

public class RoutePoliNode implements Node {
	public RoutePoliNode person = null;

	public RoutePoliNode() {

	}

	@Override
	public void setNext(Node node) {
		this.person = (RoutePoliNode) node;
	}

	@Override
	public Node getNext() {
		return person;
	}

	@Override
	public Node clone() {
		RoutePoliNode temp = new RoutePoliNode();
		return temp;
	}

	@Override
	public boolean isEqual(Node node) {
		return false;
	}

	@Override
	public boolean isLessThan(Node node) {
		return false;
	}

}
