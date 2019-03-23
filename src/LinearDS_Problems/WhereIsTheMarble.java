package LinearDS_Problems;
import java.io.*;
import DataStructure.Node;
import DataStructure.List;

/*
# Contest Problem: WhereIsTheMarble
# https://www.urionlinejudge.com.br/judge/en/problems/view/1025
*/

public class WhereIsTheMarble {
	public class ProblemNode implements Node
	{
		public int value;
		public ProblemNode next = null;
		
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
			ProblemNode temp = (ProblemNode)node;
			return this.value == temp.value ? true : false;
		}


		@Override
		public boolean isLessThan(Node node) 
		{
			ProblemNode temp = (ProblemNode)node;
			return this.value < temp.value ? true : false;
		}
		
		public String toString()
		{
			return " " + this.value;
		}
	}
	
	
	public WhereIsTheMarble() {}
	
	
	public String solution(String input) 
	{
		String response = "";
		
		try
		{
			BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
			
			int size = Integer.parseInt( input.split(" ")[0] );
			int searchs = Integer.parseInt( input.split(" ")[1] );
			int index = -1, number;
			List marbles = new List();
			
			for(int i = 0; i < size; i++)
				marbles.insertAtEnd(new ProblemNode( Integer.parseInt( br.readLine() ) ));
			
			marbles = marbles.quickSort(marbles);
			
			for(int i = 0; i < searchs; i++)
			{
				number = Integer.parseInt( br.readLine() );
				index = marbles.indexOf(new ProblemNode( number ));
				
				if(index != -1)
					response += number + " found at " + (index + 1) + "\n";
				else
					response += number + " not found\n"; 
			}
		}
		catch(Exception ex) {}
		
		return response;
	}
	
	
	public static void main(String[] args)
	{
		String input = "";
		int cases = 1;
		
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		WhereIsTheMarble problem = new WhereIsTheMarble();
		
		try 
		{
			input = br.readLine();
			
			while(!input.equals("0 0"))
			{
				bw.write( "CASE# " + cases + ":\n" + problem.solution(input) );
				bw.flush();
				input = br.readLine();
				cases += 1;
			}
		}
		catch(Exception ex) {}
	}
}