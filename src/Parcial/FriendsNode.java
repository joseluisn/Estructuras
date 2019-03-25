package Parcial;
import DataStructure.Node;

public class FriendsNode implements Node {
	
	private String name;
	public FriendsNode nextFriend = null;
	
	//builder of class FriendsNode
		public FriendsNode(String name){
			this.setName(name);
		}

	@Override
	public void setNext(Node node) {
		this.nextFriend = (FriendsNode)node;
	}

	@Override
	public Node getNext() {
		return nextFriend;
	}

	@Override
	public Node clone() {
		FriendsNode temp= new FriendsNode(this.name);
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
