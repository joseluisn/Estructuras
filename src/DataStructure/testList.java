package DataStructure;

import DataStructure.List;
import DataStructure.ExampleNode;

public class testList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lista = new List();
		ExampleNode node1 = new ExampleNode(4);
		ExampleNode node2 = new ExampleNode(2);
		ExampleNode node3 = new ExampleNode(5);
		ExampleNode node4 = new ExampleNode(8);

		lista.insertAtBegin(node4);
		lista.insertAtEnd(node2);
		lista.printList();
		System.out.println("");
		System.out.println("La lista clonada es " + lista.cloneList());

		lista.insertAtIndex(node3, 1);
		lista.printList();
		lista.deleteAtEnd();
		System.out.println("");
		lista.printList();
		lista.insertAtBegin(node1);
		lista.printList();
		System.out.println("Eliminando por index");
		lista.deleteAtIndex(0);
		lista.printList();
	}

}
