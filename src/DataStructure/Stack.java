package DataStructure;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Stack {
public Node top = null; //top
	
	public Stack() {}
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		return top == null ? true : false;
	}
	
	
	/**
	 * 
	 * @param newNode
	 */
	public void push(Node newNode)
	{
		newNode.setNext(top);
		top = newNode;
		
	}
	
	
	/**
	 * 
	 * @return
	 */
	public Node pop()
	{
		Node temp = top;
		top = temp.getNext();
		temp.setNext(null);
		
		return temp;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String peek()
	{
		return null;
	}
	
	
	/**
	 * 
	 */
	public void printStack()
	{
		BufferedWriter bw = new BufferedWriter(	new OutputStreamWriter( System.out ));
		
		try
		{
			while(!isEmpty())
				bw.write(pop().toString());
			
			bw.flush();
		}
		catch(Exception ex) { ex.printStackTrace(); }
	}
}
