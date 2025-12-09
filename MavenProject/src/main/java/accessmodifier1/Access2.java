package accessmodifier1;

public class Access2 extends AccessOne{

	public static void main(String[] args)  {
		
		AccessOne obj=new AccessOne();
		obj.display();
		obj.display1();
	//	obj.display2();  cannot access this method as it is private method
		obj.display3();
	}

}
