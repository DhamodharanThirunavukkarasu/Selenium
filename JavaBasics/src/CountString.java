import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hi i am new to the selenium";
		String[] s1=str.split(" ");		
		Map<String,Integer> map=new HashedMap<String, Integer>();
		for(String x:s1)
		{
			if(map.containsKey(x))
			{
				int c=map.get(x);
				map.put(x, c+1);
			}else
			{
				map.put(x, 1);
			}
		}
		System.out.println(map);
		
		
	}

}
