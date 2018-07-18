package CollectionsConcept;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar=new ArrayList();
		ar.add("10");
		ar.add("selenium");
		ar.add(true);
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}

	}

}
