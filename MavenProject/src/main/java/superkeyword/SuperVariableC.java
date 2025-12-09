package superkeyword;

public class SuperVariableC extends SuperVariableP{

	public static void main(String[] args) {
		
		SuperVariableC obj=new SuperVariableC();
		obj.print();

	}
	int x=10;
	public void print()
	{
		System.out.println(x);	
		System.out.println(super.x);	
		System.out.println(super.color);	
	}
}
