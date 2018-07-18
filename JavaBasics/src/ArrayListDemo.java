import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Dhamodharan
 *
 */
public class ArrayListDemo {

	/**
	 * @param args
	 /*Practicing the arraylist*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Dhamo");
		a.add("Vicky");
		a.add("Abishek");
		System.out.println(a);
		a.add(0, "Dharan");
		System.out.println(a);
		System.out.println(a.get(2));
		a.remove("Vicky");
		System.out.println(a);
		System.out.println(a.contains("java"));
		System.out.println(a.isEmpty());
		a.clear();
		System.out.println(a.isEmpty());
		
		
		
		

	}

}
