

public class TryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=0;
	
		
		try
		{
			//int c=a/b;
			int ar[]=new int[5];
			
			System.out.println(ar[7]);
					
	}
		catch(ArithmeticException et)
		{
			System.out.println("I got the ArithmeticException");
		}
		/*catch(Exception e)
		{
			System.out.println("I got the error");
		}*/
		catch(ArrayIndexOutOfBoundsException t)
		{
			System.out.println("I got the ArrayIndexOutOfBoundsException");
		}

	}

}
