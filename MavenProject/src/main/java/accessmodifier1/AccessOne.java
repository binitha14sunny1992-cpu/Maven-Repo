package accessmodifier1;

public class AccessOne {

	public static void main(String[] args) {
		AccessOne obj=new AccessOne();
		obj.display();
		obj.display1();
		obj.display2();
		obj.display3();

	}
	public void display()
	{
		System.out.println("Public");
	}
	protected void display1()
	{
		System.out.println("Protected");
	}
	private void display2()
	{
		System.out.println("Private");
	}
	void display3()
	{
		System.out.println("Default");
	}

}
