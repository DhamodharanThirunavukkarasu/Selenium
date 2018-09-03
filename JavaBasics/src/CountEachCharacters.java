import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class CountEachCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Welcome";
		char[] c=str.toCharArray();
		Map<Character,Integer> m=new HashedMap<Character,Integer>();
		for(char x:c)
		{
			if(m.containsKey(c))
			{
				int count=m.get(x);
				m.put(x, count+1);
			}else
			{
				m.put(x, 1);
			}
			
		}
		System.out.println(m);
		}
		

	}

