package Graph;

import DataStructure.List;
import DataStructure.Node;
import DataStructure.Stack;

public class GraphNode implements Node {
	private int Data;
	int label;
	Node next;
	List nodes = new List();
	List edges = new List();
	boolean visited;

	public GraphNode(int Data, int label) {
		this.Data = Data;
		this.label = label;
	}

	public void insert_node() {
		nodes.insertAtEnd(next);
	}

	public void delete_node() {
		GraphNode search = new GraphNode(0, label);
		for (int i = 0; i < nodes.length(); i++)
			if (nodes.get(i).isEqual(search)) {
				nodes.deleteAtIndex(i);
				break;
			}

	}

	public void insert_edge(int label1, int label2) {
		GraphNode search = new GraphNode(0, label1);
		for (int i = 0; i < nodes.length(); i++)
			if (nodes.get(i).isEqual(search)) {
				edges.insertAtEnd(search);
				break;
			}

		search = new GraphNode(0, label2);
		for (int i = 0; i < nodes.length(); i++)
			if (nodes.get(i).isEqual(search)) {
				edges.insertAtEnd(search);
				break;
			}

	}

	public boolean if_exists(int label) {
		GraphNode search = new GraphNode(0, label);
		for (int i = 0; i < nodes.length(); i++)
			if (nodes.get(i).isEqual(search)) {
				return true;
			}
		return false;
	}

	public List getNodes() {
		return nodes;
	}
	public void setNodes(List node) {
		this.nodes = node;
	}
	
	public void articulationPoints(Node node) {
		Stack stack = new Stack();
		GraphNode node1 = new GraphNode(Data, label);
		stack.push(node1);

		node1.visited = true;
		while (!stack.isEmpty()) {
			Node element = stack.pop();
			
			List neighbours = new List();
			neighbours = (List) element.getNext();
			for (int i = 0; i < neighbours.length(); i++) {
				Node n = neighbours.get(i);
				if (n != null && !Node.visited) {
					stack.push(n);
				    visited = true;

				}
			}
		}
	}

	@Override
	public void setNext(Node node) {
		next = (GraphNode) node;
	}

	@Override
	public Node getNext() {
		return next;
	}

	@Override
	public Node clone() {
		return new GraphNode(this.getData(), Data);
	}

	@Override
	public boolean isEqual(Node node) {
		GraphNode temp = (GraphNode) node;
		return this.getData() == temp.getData() ? true : false;
	}

	@Override
	public boolean isLessThan(Node node) {
		GraphNode temp = (GraphNode) node;
		return this.getData() < temp.getData() ? true : false;
	}

	int getData() {
		return Data;
	}

	void setData(int data) {
		Data = data;
	}

}
