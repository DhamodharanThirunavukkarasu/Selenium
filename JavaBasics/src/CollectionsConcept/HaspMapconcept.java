package CollectionsConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HaspMapconcept {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "selenium");
		hm.put(2, "qtp");
		System.out.println(hm.get(1));
		//iterate all the objects
		
		for(Entry<Integer, String> m: hm.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		
		
		
		
		
	}

}
