package CollectionsConcept;

import java.util.ArrayList;

public class UniqueNo {

	public static void main(String[] args) {
		
		
		int a[]= {1,2,2,3,1};
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)		
		{
			
			int k=0;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				System.out.println(a[i]);
				System.out.println(k);
				if(k==1)
				{
					System.out.println(a[i]+"is unique");
				}
				
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
