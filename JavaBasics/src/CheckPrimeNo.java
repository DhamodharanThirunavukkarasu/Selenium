import java.util.Scanner;

public class CheckPrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no to check prime no");
		int number=sc.nextInt();
		int count=0;
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(number+" is prime number");
		}
		else
		{
			System.out.println(number+" is not prime number");
		}
		
		
	}

}
