
public class ContructorDemo {
	
	public ContructorDemo()
	{
		System.out.println("This is contructor block");
	}
	public ContructorDemo(int a)
	{
		System.out.println("This is contructor block of argument 5");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContructorDemo c=new ContructorDemo();
		ContructorDemo d=new ContructorDemo(5);
	}

}
