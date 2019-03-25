package DataStructure;

public class Queue {

	Node head = null; //
	
	public Queue() {}
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		return head == null ? true : false;
	}
	
	
	/**
	 * 
	 * @param newNode
	 */
	public void enqueue(Node newNode)
	{
		Node rec = head;
		if(!this.isEmpty()) 
			while(rec.getNext()!=null) 
				rec=rec.getNext();
			
			rec.setNext(newNode);
	}
	
	
	/**
	 * 
	 * @return
	 */
	public Node dequeue()
	{
		Node temp = head;
		head = temp.getNext();
		temp.setNext(null);
		
		return temp;
	}
}
