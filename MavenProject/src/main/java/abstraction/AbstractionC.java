package abstraction;

public class AbstractionC extends AbstractionP{

	public static void main(String[] args) {
		/*AbstractionC obj=new AbstractionC();
		obj.display(100);
		obj.sum();*/
		
		AbstractionP obj1=new AbstractionC(); //we can use this way as well parent obj=new childclass.
		obj1.sum();
		obj1.display(200);

	}
	void display(int num)
	{
		System.out.println("Number"+num);
	}

}
