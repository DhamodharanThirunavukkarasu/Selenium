
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="madam"; String m=str;
		int l=str.length();
		String s="";
		for(int i=l-1;i>=0;i--)
		{
			char c=str.charAt(i);
			s=s+c;
		}
		if(s.equals(m))
		{
			System.out.println("palindrome string");
		}
		else
		{
			System.out.println("not a palindrome");
		}

	}

}
