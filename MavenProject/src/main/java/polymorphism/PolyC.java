package polymorphism;

public class PolyC extends PolyP {

	public static void main(String[] args) {
		PolyC obj=new PolyC();
		obj.print();

	}
	public void print()
	{
		super.print();  //method overriding
		System.out.println("Child Method");
	}

}
