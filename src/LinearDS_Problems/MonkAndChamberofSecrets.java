package LinearDS_Problems;
import DataStructure.Queue;
import DataStructure.Node;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



/*
# Contest Problem: Monk And Chamber Of Secrets
# https://www.hackerearth.com/practice/data-structures/queues/basics-of-queues/practice-problems/algorithm/monk-and-chamber-of-secrets/
#
*/
public class MonkAndChamberofSecrets {
	/**
	 * 
	 *
	 */
	public class ProblemNode implements Node
	{
		public int index;
		public int value;
		public ProblemNode next = null;
		
		/**
		 * 
		 * @param value
		 */
		public ProblemNode(int value, int index) 
		{
			this.value = value;
			this.index = index;
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
			ProblemNode temp = new ProblemNode(this.value, this.index);
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
			return this.index + " ";
		}
	}
	
	/**
	 * 
	 */
	public MonkAndChamberofSecrets() {}
	
	
	/**
	 * 
	 * @return
	 */
	public String solution() 
	{
		String response = "";
				
		try
		{
			int spidersQueue = 0, spidersToSelect = 0, counter = 0, max;
			
			BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
			String[] input = br.readLine().split(" ");
			
			spidersQueue = Integer.parseInt( input[0] );
			spidersToSelect = Integer.parseInt( input[1] );
			
			ProblemNode spider = null;
			Queue spiders = new Queue();
			Queue selected = new Queue();
			Queue temp;
			
			input = br.readLine().split(" ");
			
			for(int i = 0; i < spidersQueue; i++)
				spiders.enqueue(new ProblemNode( Integer.parseInt(input[i]) , (i + 1) ));

			for(int i = 0; i < spidersToSelect; i++)
			{
				counter = 0;
				temp = new Queue();
				max = Integer.MIN_VALUE;
				
				while(counter < spidersToSelect && !spiders.isEmpty())
				{
					spider = (ProblemNode)spiders.dequeue();
					
					if(max < spider.value)
						max = spider.value;
					
					temp.enqueue( spider );
					counter++;
				}
				
				while(!temp.isEmpty())
				{
					spider = (ProblemNode)temp.dequeue();
					
					if(spider.value ==  max)
					{
						selected.enqueue(spider);
						max = -1;
					}
					else
					{
						if(spider.value > 0)
							spider.value -= 1;
						
						spiders.enqueue( spider );
					}
				}
			}
			
			while(!selected.isEmpty())
				response += selected.dequeue().toString();
			
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		
		return response;
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		
		try 
		{
			MonkAndChamberofSecrets problem = new MonkAndChamberofSecrets();
			bw.write( problem.solution() + "\n" );
			bw.flush();
		}
		catch(Exception ex) {}
	}
}
