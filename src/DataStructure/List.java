package DataStructure;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class List {
	public Node head = null;

	public List() {
	}

	/**
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return head == null ? true : false;
	}

	/**
	 * 
	 */
	public void printList() {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Node temp = head;

		try {
			while (temp != null) {
				bw.write(temp.toString());
				temp = temp.getNext();
			}
			bw.flush();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * 
	 * @param newNode
	 */
	public void insertAtBegin(Node newNode) {
		newNode.setNext(head);
		head = newNode;
	}

	/**
	 * 
	 * @param newNode
	 */
	// Method to insert node in position final
	public void insertAtEnd(Node newNode) {
		Node temp = newNode;
		if (head == null) {
			head = newNode;
		} else {
			Node aux = head;

			while (aux.next != null) {
				aux = aux.next;
			}
			aux.setNext(newNode);
		}

	}

	/**
	 * 
	 * @param newNode
	 * @param index
	 */
	// Method to insert element in position required
	public void insertAtIndex(Node newNode, int index) {
		Node temp = head;
		Node before = temp;
		Node toInsert = newNode;

		for (int i = 0; i < index; i++) {

			before = temp;
			temp = temp.getNext();
		}

		toInsert.setNext(before.next);
		before.setNext(newNode);
		System.gc();

	}

	/**
	 * 
	 */
	public void deleteAtBegin() {
		Node temp = head;
		head = temp.getNext();
		temp = null;
		System.gc();
	}

	/**
	 * 
	 */
	// Method to delete element in end position
	public void deleteAtEnd() {
		Node temp = head;
		Node before = temp;
		while (temp.getNext() != null) {
			before = temp;
			temp = temp.getNext();
		}
		temp = null;
		before.setNext(null);
		System.gc();
	}

	/**
	 * 
	 * @param index
	 */
	public void deleteAtIndex(int index) {
		Node temp = head;
		Node toDelete;

		for (int i = 0; i < index - 1; i++)
			temp = temp.getNext();

		toDelete = temp.getNext();
		temp.setNext(toDelete.getNext());
		toDelete = null;
		System.gc();
	}

	/**
	 * 
	 * @param oldNode
	 * @param newNode
	 */
	public void updateFirst(Node oldNode, Node newNode) {
		Node temp = head;
		Node previous = head;

		while (temp != null) {
			if (temp.isEqual(oldNode)) {
				newNode.setNext(temp.getNext());
				previous.setNext(newNode);
				temp = null;
				break;
			}

			previous = temp;
			temp = temp.getNext();
		}
	}

	/**
	 * 
	 * @param oldNode
	 * @param newNode
	 */
	public void updateAll(Node oldNode, Node newNode) {
		Node temp = head;
		Node previous = head;

		while (temp != null) {
			if (temp.isEqual(oldNode)) {
				newNode.setNext(temp.getNext());
				previous.setNext(newNode);
				temp = null;
				previous = newNode;
				temp = newNode.getNext();
			} else {
				previous = temp;
				temp = temp.getNext();
			}
		}
	}

	/**
	 * 
	 * @param node
	 * @return
	 */
	public Node linealSearch(Node node) {
		Node temp = head;
		Node result = null;

		while (temp != null)
			if (temp.isEqual(node)) {
				result = temp;
				break;
			} else
				temp = temp.getNext();

		return result;
	}

	/**
	 * 
	 * @param node
	 * @return
	 */
	public List searchAll(Node node) {
		Node temp = head;
		List results = new List();

		while (temp != null) {
			if (temp.isEqual(node)) {
				results.insertAtEnd(temp.clone());
			}

			temp = temp.getNext();
		}

		return results;
	}

	/**
	 * 
	 * @param node
	 * @return
	 */
	public int binarySearch(Node node) {
		int lower_boud = 0, upper_bound = this.length() - 1;
		int middle = 0, index = -1;

		while (upper_bound > lower_boud) {
			middle = (lower_boud + upper_bound / 2);

			if (get(middle).isEqual(node)) {
				index = middle;
				break;
			} else if (get(middle).isLessThan(node))
				lower_boud = middle + 1;
			else
				upper_bound = middle - 1;

		}
		return index;
	}

	/**
	 * 
	 */
	public void reverse() {
		Stack tempStack = new Stack();
		Node temp = head;

		while (temp != null) {
			tempStack.push(temp.clone());
			temp = temp.getNext();
		}

		head = tempStack.top;
	}

	/**
	 * 
	 * @param unsorted
	 * @return
	 */
	public List quickSort(List unsorted) {
		if (unsorted.length() <= 1) {
			return unsorted;
		} else {
			Node pivot = unsorted.head;
			Node temp = pivot.getNext();

			List less_elements = new List();
			List greater_elements = new List();

			while (temp != null) {
				if (temp.isLessThan(pivot))
					less_elements.insertAtEnd(temp.clone());
				else
					greater_elements.insertAtEnd(temp.clone());

				temp = temp.getNext();
			}

			pivot.setNext(null);
			less_elements = quickSort(less_elements);
			less_elements.insertAtEnd(pivot);
			less_elements.insertAtEnd(quickSort(greater_elements).head);

			return less_elements;
		}
	}

	public List sublist(int begin) {
		List subList = new List();

		if (begin < this.length()) {
			Node temp = head;

			for (int i = 0; i < begin; i++)
				temp = temp.getNext();

			while (temp != null) {
				subList.insertAtEnd(temp.clone());
				temp = temp.getNext();
			}
		}

		return subList;
	}

	/**
	 * 
	 * @param begin
	 * @param end
	 * @return
	 */
	public List sublist(int begin, int end) {
		List subList = new List();

		if (begin < this.length() && end < this.length() && begin < end) {
			Node temp = head;

			for (int i = 0; i < begin; i++)
				temp = temp.getNext();

			// while(!temp.equals(get(end)))
			for (int i = 0; i < (end - begin); i++) {
				subList.insertAtEnd(temp.clone());
				temp = temp.getNext();
			}
		}

		return subList;
	}

	/**
	 * 
	 * @return
	 */
	public int length() {
		int cont = 0;
		Node rec = head;
		while (rec.next != null) {
			rec = rec.getNext();
			cont++;
		}
		return cont;
	}

	/**
	 * 
	 * @return
	 */
	public List cloneList() {
		Node rec = head;
		List newList = new List();

		while (rec.next != null) {
			newList.insertAtEnd(rec.clone());
			rec = rec.getNext();
		}
		return newList;
	}

	/**
	 * 
	 * @param list
	 * @return
	 */
	public boolean isEqual(List list) {
		boolean isEqual = true;
		Node tempCurrent = head;
		Node tempList = list.head;

		while (tempCurrent != null && tempList != null)
			if (tempCurrent.isEqual(tempList)) {
				tempCurrent = tempCurrent.getNext();
				tempList = tempList.getNext();
			} else {
				isEqual = false;
				break;
			}

		return isEqual;
	}

	/**
	 * 
	 * @param index
	 * @return
	 */
	public Node get(int index) {
		Node result = null;

		if (index < this.length()) {
			Node rec = head;
			for (int i = 0; i < index; i++)
				rec = rec.getNext();

			result = rec.clone();
		}
		return result;

	}

	/**
	 * 
	 * @param node
	 * @return
	 */
	public int indexOf(Node node) {
		int index = -1;
		Node temp = head;

		while (temp != null) {
			index += 1;
			if (temp.isEqual(node))
				return index;

			temp = temp.getNext();
		}

		index = -1;
		return index;
	}
}
