import java.util.Scanner;

public class CheckAmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the number to check palindrome or not");
		int	number=n.nextInt();
		int temp,r,sum=0;
		temp=number;
		while(number>0)
		{
			r=number%10;
			sum=sum+(r*r*r);
			number=number/10;
		}
		if(temp==sum)
		{
			System.out.println("no is amstrong");
		}
		else
		{
			System.out.println("not is amstrong");
		}

	}

}
