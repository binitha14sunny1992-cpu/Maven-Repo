package interfaceexample;

public class ChildAB implements ParentA, ParentB { //multiple inheritance

	public static void main(String[] args) {
		ChildAB obj=new ChildAB();
		obj.display();
		obj.print();
		obj.sum();

	}
	public void display()
	{
		System.out.println("Welcome parentA");
	}
	public void print()
	{
		System.out.println("Hello ParentA");
	}
	public void sum()
	{
		System.out.println("Parent B method");
	}

}
