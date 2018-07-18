import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("java");
		hs.add("Selenium");
		hs.add("appium");
		hs.add("python");
		System.out.println(hs);
		System.out.println(hs.size());
		
		//iterator concept
		
		Iterator<String> it=hs.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
				}
	}

}
