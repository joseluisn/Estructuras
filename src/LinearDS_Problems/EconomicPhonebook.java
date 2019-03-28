package LinearDS_Problems;

import DataStructure.Node;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import DataStructure.List;
//https://www.urionlinejudge.com.br/judge/en/problems/view/1211

public class EconomicPhonebook implements Node {

	public EconomicPhonebook PhoneBook = null;

	private String name;
	public int num;

	public EconomicPhonebook(int number) {
		this.num = number;
		}

	@Override
	public void setNext(Node node) {
		this.PhoneBook = (EconomicPhonebook) node;
	}

	@Override
	public Node getNext() {
		return PhoneBook;
	}

	@Override
	public Node clone() {
		EconomicPhonebook temp = new EconomicPhonebook(this.num);
		return temp;
	}

	@Override
	public boolean isEqual(Node node) {
		EconomicPhonebook temp = (EconomicPhonebook) node;
		return this.num == temp.num ? true : false;
	}

	@Override
	public boolean isLessThan(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int solution(int number) {
		List list1 = new List();
		List list2 = new List();
		int cont=0;
		
		for(int i=0;i<number;i++) {
			list1.insertAtEnd(getNext());
		}
		list2.cloneList();
		
		while(list1.length()!=list2.length()) {
			if(list2.isEqual(list1)) {
				cont++;
			}
		}
		return  cont;
	}
	
	public static void main(String[] args)
	{
		int number = 0;
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ));
		EconomicPhonebook problem = new EconomicPhonebook(number);
		
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
