package DataStructure;
import DataStructure.List;
import DataStructure.ExampleNode;
public class testList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lista = new List();
		ExampleNode node1= new ExampleNode(4);
		ExampleNode node2= new ExampleNode(2);
	
		
		lista.insertAtBegin(node1);
		lista.insertAtEnd(node2);
		lista.printList();

	}

}
