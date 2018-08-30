package CollectionsConcept;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> l=new LinkedList<String>();
		//add
		l.add("Dhamo");
		l.add("Dharan");
		l.add("Susi");
		System.out.println("Content of linkedlist"+l);
		//addfirst and last index
		
		l.addFirst("Amma");
		l.addLast("Appa");
		System.out.println("Content of linkedlist"+l);
		//add particular index
		l.add(1, "Saranya");
		l.add(5, "Prathap");
		l.add(6,"Prakash");
		System.out.println("Content of linkedlist"+l);
		
		//Remove
		
	l.removeFirst();
	System.out.println("Content of linkedlist"+l);
	
	//for loop
	System.out.println("****For loop iteration*****");
	
	for(int i=0;i<l.size();i++)
	{
	
		System.out.println(l.get(i));
			}
	//Advance for loop
	System.out.println("****For loop iteration*****");
		for(String str:l)
		{
			System.out.println(str);
		}
	
		//Iterator loop
		System.out.println("****Using iterator iteration*****");
		
		Iterator<String>it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("****Using while loop iteration*****");
		
		int num=0;
		while(l.size()>num)
		{
			System.out.println(l.get(num));
			num++;
		}
		
		
		
		
		
		
		
		

	}

}
