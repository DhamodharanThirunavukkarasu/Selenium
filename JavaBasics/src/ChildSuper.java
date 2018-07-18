
public class ChildSuper extends ParentSuper {

	String name="Dharan";
	public void getName()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChildSuper c=new ChildSuper();
c.getName();
	}

}
