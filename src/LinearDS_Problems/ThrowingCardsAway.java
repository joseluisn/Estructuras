package LinearDS_Problems;
/*
# Contest Problem: ThrowingCardsAway
# https://www.urionlinejudge.com.br/judge/en/problems/view/1110
*/
import java.io.*;

import DataStructure.Node;
import DataStructure.Queue;


public class ThrowingCardsAway {
	public class ProblemNode implements Node
	{
		public int value;
		public ProblemNode next = null;
		
		
		/**
		 * 
		 * @param value
		 */
		public ProblemNode(int value) 
		{
			this.value = value;
		}
		
		@Override
		public void setNext(Node node) 
		{
			this.next = (ProblemNode)node;
		}


		@Override
		public Node getNext() 
		{
			return next;
		}


		@Override
		public Node clone() {
			ProblemNode temp = new ProblemNode(this.value);
			return temp;
		}


		@Override
		public boolean isEqual(Node node) 
		{
			return false;
		}


		@Override
		public boolean isLessThan(Node node) 
		{
			return false;
		}
		
		public String toString()
		{
			return " " + this.value;
		}
	}
	
	
	/**
	 * 
	 */
	public ThrowingCardsAway() {}
	
	
	/**
	 * 
	 * @param number
	 * @return
	 */
	public String solution(int number) 
	{
		Queue queue = new Queue();
		Queue removed = new Queue();
		String response = "";
		
		for(int i = 1; i <= number; i++)
			queue.enqueue(new ProblemNode(i));

		for(int i = 0; i < number - 1; i++)
		{
			removed.enqueue( queue.dequeue() );
			queue.enqueue( queue.dequeue() );
		}
		
		response = "Discarded cards:";
		while(!removed.isEmpty())
			response += removed.dequeue().toString() + ",";
		
		response = response.substring(0, response.length() - 1);
		response += "\nRemaining card: " + queue.dequeue().toString() + "\n";
		
		return response;
	}
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		int number = 0;
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		ThrowingCardsAway problem = new ThrowingCardsAway();
		
		try 
		{
			number = Integer.parseInt( br.readLine() );
			
			while(number != 0)
			{
				bw.write( problem.solution(number) );
				number = Integer.parseInt( br.readLine() );
			}
			
			bw.flush();
		}
		catch(Exception ex) {}
	}
}