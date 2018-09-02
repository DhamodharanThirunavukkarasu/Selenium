
public class SwapTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a= "Selenium";
		String b="java";
		
		System.out.println("before swapping a="+a+"b= "+b);
		//Adding two strings
		a=a+b;
			
		//assigning characters to b from string index 0 to length of subtractions of a-b;
		b=a.substring(0, a.length()-b.length());
		
		//assigning characters to a from length of b
		a=a.substring(b.length());//beginIndex
				
		System.out.println("After swapping a="+a+"---b= "+b);
				
	}

}
