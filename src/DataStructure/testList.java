package DataStructure;
import DataStructure.List;
import DataStructure.ExampleNode;
public class testList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lista = new List();
		ExampleNode node1= new ExampleNode(4);
		ExampleNode node2= new ExampleNode(2);
		ExampleNode node3= new ExampleNode(5);
		ExampleNode node4= new ExampleNode(8);
		
		
		
		lista.insertAtBegin(node4);
		lista.insertAtEnd(node2);
		lista.printList();
		System.out.println("");
		lista.insertAtIndex(node3, 1);
		lista.printList();
	}

}
