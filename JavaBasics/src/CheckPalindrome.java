import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the number to check palindrome or not");
		int	number=n.nextInt();
		int r,sum=0;
	int temp=number;
	
	while(number>0)
	{
		r=number%10;
		sum=(sum*10)+r;
		number=number/10;
	}
	if(temp==sum)
	{
		System.out.println(temp+"is Palindrome");
	}
	else
	{
		System.out.println(temp+"is not Palindrome");
	}

	}

}
