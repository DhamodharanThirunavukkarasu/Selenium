package CollectionsConcept;

import java.util.ArrayList;
import java.util.Iterator;

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
		
		
		Employee emp1=new Employee(10,"dhamo", "ece");
		Employee emp2=new Employee(20,"magesh", "IT");
		Employee emp3=new Employee(30,"aadhi", "CSE");
		
		ArrayList<Employee> ar1=new ArrayList<Employee>();
		ar1.add(emp1);
		ar1.add(emp2);
		ar1.add(emp3);
		Iterator<Employee>it=ar1.iterator();
		while (it.hasNext()) {
			Employee emp =it.next();
			System.out.print(emp.name);
			System.out.println(emp.a);
			System.out.println(emp.dep);
			
		}

	}

}
