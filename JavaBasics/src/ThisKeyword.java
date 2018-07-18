
public class ThisKeyword {
	int a=10;
	
	public void demo()
	{
		int a=5;
		System.out.println("Local variable value of a= "+a);
		System.out.println("Global variable value of a= "+this.a);
		int c=a+this.a;
		System.out.println("total of local and global variable= "+c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword th=new ThisKeyword();
		th.demo();

	}

}
